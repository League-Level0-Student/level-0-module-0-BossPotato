import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	// This recipe draws the first letter of your name using the Robot
	//
	// 1. Create a class called RobotGraffiti
	public static void main(String[] args) {
		
	// 2. Use the Robot to draw the first letter of your name
	Robot a = new Robot();
	a.penDown();
	a.setSpeed(10);
	// HINT: Use the RobotSquare recipe to help remember how to draw using Robot
	a.setAngle(30);
	a.move(200);
	a.setAngle(150);
	a.move(200);
	a.setAngle(-30);
	a.move(100);
	a.setAngle(-90);
	a.move(100);
	a.hide();
	
	// 3. BONUS: Write your entire first name using the Robot
	a.penUp();
	a.setAngle(90);
	a.move(250);
	a.setAngle(180);
	a.move(100);
	a.setAngle(0);
	a.penDown();
	a.move(200);
	a.setAngle(180);
	a.move(100);
	a.setAngle(45);
	a.move(160);
	a.setAngle(-135);
	a.move(160);
	
	a.setAngle(135);
	a.move(160);
	
	}
}
