import javax.swing.JOptionPane;

public class Greeter {
	// This recipe says "hi" to the user
	//
	// 1. Create a class called Greeter
	
	// 2. Add a main method
	public static void main(String[] args) {
		
		
	// 3. Use JOptionPane.showInputDialog to ask them their name, e.g. What is your name?
	// HINT: Use a variable to store their name
	String name = JOptionPane.showInputDialog("What is you name");
	
	// 4. Use JOptionPane.showMessageDialog to say hi to them, e.g. Hi Jackie
JOptionPane.showMessageDialog(null, "Hi "+name+".");

	}
}