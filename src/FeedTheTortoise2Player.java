// Copyright Wintriss Technical Schools 2013 
import java.awt.Component;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.TurtlePanel;

public class FeedTheTortoise2Player implements KeyEventDispatcher {

	// 1. Decide where to put the food by setting these variables
	int foodLocationX = 200;
	int foodLocationY = 200;

	// If the food does not show up, you need to switch to Java 1.6

	// 2. Choose a character for your food or leave it as *
	Component food = new Label(":-)");

	private void goUp() {
		// 3. Make the Tortoise move up the screen
		Tortoise.move(10);
	}

	private void goDown() {
		// 4. Make the Tortoise move down the screen
		Tortoise.turn(180);
		Tortoise.move(10);
		Tortoise.turn(180);
	}

	private void goLeft() {
		// 5. make the tortoise move left. Hint: Make sure to end with the
		// Tortoise facing UP.
		Tortoise.turn(270);
		Tortoise.move(10);
		Tortoise.turn(90);
	}

	private void goRight() {
		Tortoise.turn(90);
		Tortoise.move(10);
		Tortoise.turn(270);
		// 6. make the tortoise move right
	}

	private void checkIfFoodFound() throws Exception {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		// 7. if tortoise is near the food
		int threshold = (14);
		int difX = tortoiseLocationX - foodLocationX;
		int difY = tortoiseLocationY - foodLocationY;
		difX = Math.abs(difX);
		difY = Math.abs(difY);
		System.out.println(difX);
		System.out.println(difY);
		if ((difX < threshold) && (difY < threshold)) {
			System.out.println("Chomp!!!");
			Runtime.getRuntime().exec("say chomp");
			foodLocationX = tortoiseLocationX;
			foodLocationY = tortoiseLocationY;
		}

		// say something. Hint: Runtime.getRuntime().exec("say chomp")
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();
			if (e.getKeyCode() == KeyEvent.VK_SLASH) {
				foodToTortoise();
			}
			;
			// Hint: "e.getKeyCode() == KeyEvent.VK_T" is TRUE when T is pressed
			// 8. if the W key is pressed,
			// call the method moveFoodUp();

			if (e.getKeyCode() == KeyEvent.VK_W) {
				moveFoodUp();
			}
			if (e.getKeyCode() == KeyEvent.VK_D) {
				moveFoodRight();
			}
			if (e.getKeyCode() == KeyEvent.VK_S) {
				moveFoodDown();
			}
			if (e.getKeyCode() == KeyEvent.VK_A) {
				moveFoodLeft();
			}
			// 11. Do the same for left, right, and down. You can choose your
			// own keys if you like. You will need to make new methods for
			// moving the food.

			// 12. If the secret key is pressed
			// Call the method moveFoodToARandomLocation
			if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
				moveFoodToARandomLocation();
			}
			// Awesome points(finish everything else first): The person
			// controlling the food has a big disadvantage they have to keep
			// pressing buttons. While the turtle player and hold the arrow
			// keys. Can you think you think of a way to make this game more
			// fair for the food? Hint: e.getID() == KeyEvent.KEY_PRESSED is
			// true when a key is first pressed and e.getID() ==
			// KeyEvent.KEY_RELEASED is true when a key is released.

		}
		return processEvent();
	}

	private void foodToTortoise() {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();
		foodLocationX = tortoiseLocationX + 20;
		foodLocationY = tortoiseLocationY + 20;
		moveFood();
	}

	private void moveFoodUp() {
		System.out.println("Move food up!");
		// 9. decrement foodLocationY
		foodLocationY -= 5;
		// 10. call the moveFood() method
		moveFood();
	}

	private void moveFoodRight() {
		System.out.println("Move food right!");
		foodLocationX += 5;
		moveFood();
	}

	private void moveFoodDown() {
		System.out.println("Move food down!");
		foodLocationY += 5;
		moveFood();
	}

	private void moveFoodLeft() {
		System.out.println("Move food left!");
		foodLocationX -= 5;
		moveFood();
	}

	private void moveFoodToARandomLocation() {
		foodLocationX = new Random().nextInt(window.getSize().width);
		foodLocationY = new Random().nextInt(window.getSize().height);
		moveFood();
	}

	private void moveFood() {
		food.setLocation(foodLocationX, foodLocationY);
		window.add(food);
	}

	TurtlePanel window = Tortoise.getBackgroundWindow();

	public static void main(String[] args) {
		FeedTheTortoise2Player feeder = new FeedTheTortoise2Player();
		feeder.controlTheTortoise();
		feeder.feedTheTortoise();
	}

	private void controlTheTortoise() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager()
				.addKeyEventDispatcher(this);
		Tortoise.show();
		Tortoise.setSpeed(10);
		Tortoise.getBackgroundWindow().setBackground(Colors.getRandomColor());

	}

	private void feedTheTortoise() {
		moveFood();
	}

	private boolean processEvent() {
		try {
			checkIfFoodFound();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
