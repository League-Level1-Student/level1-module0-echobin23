import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot Bob = new Robot();
	 static int height = 0;
	public static void main(String[] args) {
		
		Bob.setX(50);
		Bob.setY(550);
		Bob.penDown();
		Bob.setSpeed(10);
		for(int i = 0;i<10;i++) {
			buildhouse("small");
		}
		}
	static void buildhouse(String size) {
		if(size.equals("small")) {
			height = 60;
		}
		if(size.equals("mediam")) {
			height = 120;
		}
		if(size.equals("large")) {
			height = 250;
		}
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
