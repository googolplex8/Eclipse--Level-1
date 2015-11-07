import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class house {
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		Tortoise.setPenWidth(6);
		Tortoise.setX(30);
		Tortoise.setY(400);
		Tortoise.show();
		drawbuilding("small", Colors.Browns.SaddleBrown);
		drawbuilding("medium", Colors.Blues.Blue);
		drawbuilding("large", Colors.Yellows.Gold);

	}

	private static void drawbuilding(String height, Color houseColor) {
		int heightInt = 0;
		if (height.equals("small")) {
			heightInt = 70;
			Tortoise.setPenColor(houseColor);
		} else if (height.equals("medium")) {
			heightInt = 120;
			Tortoise.setPenColor(houseColor);
		} else if (height.equals("large")) {
			heightInt = 250;
			Tortoise.setPenColor(houseColor);
		}
		Tortoise.move(heightInt);
		Tortoise.turn(60);
		Tortoise.move(30);
		Tortoise.turn(60);
		Tortoise.move(30);
		Tortoise.turn(60);
		Tortoise.move(heightInt);
		Tortoise.turn(-90);
		Tortoise.setPenColor(Colors.Greens.ForestGreen);
		Tortoise.move(15);
		Tortoise.setPenColor(houseColor);
		Tortoise.turn(-90);
	}
	
}
