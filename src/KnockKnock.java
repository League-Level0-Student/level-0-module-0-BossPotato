import javax.swing.JOptionPane;

public class KnockKnock {
	// This recipe tells the user a knock-knock joke
	//
	// 1. Create a class called KnockKnock
	// 2. Add a main method
	public static void main(String[] args) {

		// 3. Find your favorite knock-knock joke
		// Knock! Knock!

		// Who’s there?

		// Irish.

		// Irish who?

		// Irish you a Merry Christmas!

		// 4. Use pop-ups (JOptionPane.showMessageDialg) to display each line of the
		// joke

		String first = JOptionPane.showInputDialog("Knock knock!");
		if (first.equals("Who's there?")) {

			String second = JOptionPane.showInputDialog("Irish");
			if (second.equals("Irish who?")) {

				JOptionPane.showMessageDialog(null, "Irish you a merry Christmas!");
			}
			else {
				JOptionPane.showMessageDialog(null, "You obviously don't know how to do knock knock jokes.");
			}
		}

		else {
			JOptionPane.showMessageDialog(null, "You obviously don't know how to do knock knock jokes.");
		}

	}
}
