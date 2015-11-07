import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	public static void main(String[] args) {
		new ChuckleClicker().createUI();
	}

	JFrame frame = new JFrame("Chuckle Clicker");
	JPanel panel = new JPanel();
	JButton joke = new JButton("Joke");
	JButton answer = new JButton("Answer");

	void createUI() {
frame.setVisible(true);
		frame.add(panel);
		panel.add(joke);
		panel.add(answer);
		joke.addActionListener(this);
		answer.addActionListener(this);
		frame.pack();
	}

	public void actionPerformed(ActionEvent arg0) {
		JButton buttonClicked = (JButton) arg0.getSource();
		if (buttonClicked.equals(joke)) {
			JOptionPane.showMessageDialog(null,
					"Why can't you see hippopatumus that hide in trees?");
		}
		if (buttonClicked.equals(answer)) {
			JOptionPane.showMessageDialog(null, "Because they're good at it");
		}
	}
}
