import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class luckyButton implements ActionListener {
	public static void main(String[] args) {
		new luckyButton().createUI();
	}

	JButton a = new JButton();
	JButton b = new JButton();
	JButton c = new JButton();
	JButton d = new JButton();
	JButton e = new JButton();

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	int size = 100;

	void createUI() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setTitle("Luck of the Click");
		panel.add(a);
		panel.add(b);
		panel.add(c);
		panel.add(d);
		panel.add(e);
		a.setText("A");
		b.setText("B");
		c.setText("C");
		d.setText("D");
		e.setText("E");
		// a.setPreferredSize(size);
		frame.pack();
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		Random r = new Random();
		int rand = r.nextInt(4);
		if (buttonPressed == a) {
			System.out.println("test");
		}
		if (buttonPressed == a && rand == 0) {
			System.out.println("YOU Win");
		} else if (buttonPressed == a && rand == 1 || rand == 2 || rand == 3
				|| rand == 4) {
			System.out.println("You Loose");
		}
		if (buttonPressed == b && rand == 1) {
			System.out.println("YOU Win");
		} else if (buttonPressed == b && rand == 0 || rand == 2 || rand == 3
				|| rand == 4) {
			System.out.println("You Loose");
		}
		if (buttonPressed == c && rand == 2) {
			System.out.println("YOU Win");
		} else if (buttonPressed == c && rand == 1 || rand == 0 || rand == 3
				|| rand == 4) {
			System.out.println("You Loose");
		}
		if (buttonPressed == d && rand == 3) {
			System.out.println("YOU Win");
		} else if (buttonPressed == d && rand == 1 || rand == 2 || rand == 0
				|| rand == 4) {
			System.out.println("You Loose");
		}
		if (buttonPressed == e && rand == 4) {
			System.out.println("YOU Win");
		} else if (buttonPressed == e && rand == 1 || rand == 2 || rand == 3
				|| rand == 0) {
			System.out.println("You Loose");
		}
	}
}