import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class binaryButtonsPic implements ActionListener {
	JFrame frame = new JFrame("A full bite!!!");
	JPanel panel = new JPanel();
	JButton button1 = new JButton(createImage("blank_card.png"));
	JButton button2 = new JButton(createImage("blank_card.png"));
	JButton button4 = new JButton(createImage("blank_card.png"));
	JButton button8 = new JButton(createImage("blank_card.png"));
	JButton button16 = new JButton(createImage("blank_card.png"));
	// JButton button32 = new JButton(createImage("blank_card.png"));
	// JButton button64 = new JButton(createImage("blank_card.png"));
	// JButton button128 = new JButton(createImage("blank_card.png"));
	JButton buttonClear = new JButton("Clear");
	int sum = 0;
	JLabel label = new JLabel("Your sum is " + sum);

	public static void main(String[] args) {
		new binaryButtonsPic().creatUI();
	}

	void creatUI() {

		frame.add(panel);
		frame.setVisible(true);
		// panel.add(button128);
		// panel.add(button64);
		// panel.add(button32);
		panel.add(button16);
		panel.add(button8);
		panel.add(button4);
		panel.add(button2);
		panel.add(button1);
		panel.add(buttonClear);
		panel.add(label);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button4.addActionListener(this);
		button8.addActionListener(this);
		button16.addActionListener(this);
		// button32.addActionListener(this);
		// button64.addActionListener(this);
		// button128.addActionListener(this);
		buttonClear.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}

	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed.equals(button1)) {

			if (button1.getIcon().toString().contains("blank_card.png")) {
				button1.setIcon(createImage("one_card.png"));
				sum += 1;

			} else {
				button1.setIcon(createImage("blank_card.png"));
				button1.setText(" ");
				sum -= 1;
			}
		}

		if (buttonPressed.equals(button2)) {

			if (button2.getIcon().toString().contains("blank_card.png")) {
				button2.setIcon(createImage("2_card.png"));
				sum += 2;

			} else {
				button2.setIcon(createImage("blank_card.png"));
				sum -= 2;
			}
		}

		if (buttonPressed.equals(button4)) {

			if (button4.getIcon().toString().contains("blank_card.png")) {
				button4.setIcon(createImage("4_card.png"));
				sum += 4;

			} else {
				button4.setIcon(createImage("blank_card.png"));
				sum -= 4;
			}
		}

		if (buttonPressed.equals(button8)) {

			if (button8.getIcon().toString().contains("blank_card.png")) {
				button8.setIcon(createImage("8_card.png"));
				sum += 8;

			} else {
				button8.setIcon(createImage("blank_card.png"));
				sum -= 8;
			}
		}
		if (buttonPressed.equals(button16)) {

			if (button16.getIcon().toString().contains("blank_card.png")) {
				button16.setIcon(createImage("16_card.png"));
				sum += 16;

			} else {
				button16.setIcon(createImage("blank_card.png"));
				sum -= 16;
			}
		}
		if (buttonPressed.equals(buttonClear)) {
			button1.setIcon(createImage("blank_card.png"));
			button2.setIcon(createImage("blank_card.png"));
			button4.setIcon(createImage("blank_card.png"));
			button8.setIcon(createImage("blank_card.png"));
			button16.setIcon(createImage("blank_card.png"));
			// button32.setIcon(createImage("blank_card.png"));
			// button64.setIcon(createImage("blank_card.png"));
			// button128.setIcon(createImage("blank_card.png"));
			sum = 0;

		}
		label.setText("Your score is " + sum);
		frame.pack();
	}

	private Icon createImage(String filename) {
		URL imageURL = getClass().getResource(filename);
		Icon icon = new ImageIcon(imageURL);
		return icon;
	}
}
