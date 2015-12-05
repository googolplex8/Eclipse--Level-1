package hello;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class StarvingTurtle implements KeyEventDispatcher {

	// 1. Set a location for the cookie
	Random rand = new Random();
	int cookieX = rand.nextInt(100);
	int cookieY = rand.nextInt(100);

	// 2. Choose the speed you want the Tortoise to go at
	int speed = 5;

	void setup() {
		// 3. Edit this intro message to your own style
		JOptionPane.showMessageDialog(null, "Figure it out youself!");
		System.out.println(cookieX + " " + cookieY);

		// 4. For debugging purposes, show the cookie. The user won’t see this.
		showCookie();
	}

	private void goUp() {
		Tortoise.move(speed);
	}

	private void goDown() {
		Tortoise.move(-speed);
	}

	private void goLeft() {
		// 5. make the tortoise move left at the specified speed (3 lines of
		// code)
		Tortoise.turn(270);
		Tortoise.move(speed);
		Tortoise.turn(90);

	}

	private void goRight() {
		Tortoise.turn(90);
		Tortoise.move(speed);
		Tortoise.turn(270);
	}

	private void checkForFood() throws Exception {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		// 7. If the Tortoise is within 100 pixels of the food, set the
		// background color to yellow
		if (Math.abs(tortoiseLocationX - cookieX) <= 100 && Math.abs(tortoiseLocationY - cookieY) <= 100) {
			setBackgroundColor(Color.YELLOW);
		}
		// 8. If the Tortoise is within 50 pixels of the food, set the
		// background color to orange
		if (Math.abs(tortoiseLocationX - cookieX) <= 50 && Math.abs(tortoiseLocationY - cookieY) <= 50) {
			setBackgroundColor(Color.ORANGE);
		}
		// 9. If the Tortoise is within 20 pixels of the food, set the
		// background color to red
		if (Math.abs(tortoiseLocationX - cookieX) <= 20 && Math.abs(tortoiseLocationY - cookieY) <= 20) {
			setBackgroundColor(Color.RED);
		}
		// 10. If the Tortoise is within 5 pixels of the cookie, make a pop-up
		// to tell them they found it
		if (Math.abs(tortoiseLocationX - cookieX) <= 5 && Math.abs(tortoiseLocationY - cookieY) <= 5) {
			JOptionPane.showMessageDialog(null,
					"Felicidades! You found the cookie yourself iwthout any directions that give everything away!!");
			Point point = getFirstLocation();
			Tortoise.setX(point.x);
			Tortoise.setY(point.y);
		}
		int getTimeElasped;
		// 11. If more than 20 seconds have elapsed, tell them the turtle died
		// of hunger!
		if (getTimeElapsed() >= 20) {
			JOptionPane.showMessageDialog(null, "404: Thats and error.");
		}
		// 12. If the Tortoise crosses it's own path, tell them they failed and
		// move them back to the beginning

		if (wasHereBefore(tortoiseLocationX, tortoiseLocationY) == true) {
			Point point = getFirstLocation();
			Tortoise.clear();
			showCookie();
			clearPosition();
			Tortoise.setX(point.x);
			Tortoise.setY(point.y);
			JOptionPane.showMessageDialog(null, "Failed. Figure out why yourself");
		}
	}

	private long getTimeElapsed() {
		Date currentTime = new Date();
		return (currentTime.getTime() - startTime.getTime()) / 1000;
	}

	private void setBackgroundColor(Color color) {
		Tortoise.getBackgroundWindow().setBackground(color);
	}

	private void showCookie() {
		Tortoise.getBackgroundWindow().addPaintable(new Paintable() {
			public void paint(Graphics2D g, JPanel caller) {
				g.drawOval(cookieX, cookieY, 10, 10);
			}
		});
	}

	private boolean wasHereBefore(int xPosition, int yPosition) {
		if (previousLocations.contains(new Point(xPosition, yPosition)))
			return true;
		else
			return false;
	}

	private Point getFirstLocation() {
		return previousLocations.get(0);
	}

	/***********************
	 * don't worry about the stuff under here
	 ******************/

	Date startTime = new Date();

	public static void main(String[] args) {
		StarvingTurtle feeder = new StarvingTurtle();
		feeder.controlTheTortoise();
		feeder.setup();
	}

	private void controlTheTortoise() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Tortoise.show();
		Tortoise.setPenColor(PenColors.Purples.DarkMagenta);
		Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.SlateGray);
		Tortoise.setSpeed(10);
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

			try {
				checkForFood();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			savePosition(Tortoise.getX(), Tortoise.getY());
		}
		return false;
	}

	ArrayList<Point> previousLocations = new ArrayList<Point>();

	private void savePosition(int xPosition, int yPosition) {
		previousLocations.add(new Point(xPosition, yPosition));
	}
	private void clearPosition() {
		previousLocations.clear();
	}
}
