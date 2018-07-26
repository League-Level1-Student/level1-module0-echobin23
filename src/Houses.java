import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot Bob = new Robot();
	static int height = 0;

	public static void main(String[] args) {

		Bob.setX(50);
		Bob.setY(550);
		Bob.penDown();
		Bob.setSpeed(10);
		for (int i = 0; i < 10; i++) {
			buildhouse("large", "blue");
		}
	}

	static void buildhouse(String size, String color) {
		if (size.equals("small")) {
			height = 60;
		} else if (size.equals("mediam")) {
			height = 120;
		} else if (size.equals("large")) {
			height = 250;
		}
		if (color.equals("blue")) {
			Bob.setPenColor(Color.BLUE);
		} else if (color.equals("green")) {
			Bob.setPenColor(Color.GREEN);
		} else if (color.equals("red")) {
			Bob.setPenColor(Color.RED);
		} else {
			Bob.setRandomPenColor();
		}
		Bob.setWindowColor(Color.BLACK);
		Bob.move(height);
		Bob.turn(90);
		Bob.move(50);
		Bob.turn(90);
		Bob.move(height);
		Bob.turn(270);
		Bob.move(30);
		Bob.turn(270);
	}

	static void drawPointyRoof() {
		Bob.setWindowColor(Color.BLACK);
		Bob.move(height);
		Bob.turn(40);
		Bob.move(40);
		Bob.turn(90);
		Bob.move(40);
		Bob.move(height);
		Bob.turn(270);
		Bob.move(30);
		Bob.turn(270);
	}

	static void drawFlatRoof() {
		Bob.setWindowColor(Color.BLACK);
		Bob.move(height);
		Bob.turn(90);
		Bob.move(50);
		Bob.turn(90);
		Bob.move(height);
		Bob.turn(270);
		Bob.move(30);
		Bob.turn(270);
	}
}
