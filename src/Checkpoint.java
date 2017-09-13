import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
	String color = JOptionPane.showInputDialog("What is your favorite color?");
	JOptionPane.showMessageDialog(null, color + " is my favorite color, too!");
	
	Robot a = new Robot();
	a.setSpeed(10);
	a.penDown();
	for (int i = 0; i < 3; i++) {
		a.turn(120);
		a.move(200);
	}
	
	
	
}
}
