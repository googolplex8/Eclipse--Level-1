import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class binaryButtons implements ActionListener {
	JFrame frame = new JFrame("A full bite!!!");
	JPanel panel = new JPanel();
	JButton button1 = new JButton(" ");
	JButton button2 = new JButton(" ");
	JButton button4 = new JButton(" ");
	JButton button8 = new JButton(" ");
	JButton button16 = new JButton(" ");
	JButton button32 = new JButton(" ");
	JButton button64 = new JButton(" ");
	JButton button128 = new JButton(" ");
	JButton buttonClear = new JButton("Clear");
	int sum = 0;
	JLabel label = new JLabel("Your sum is " + sum);

	public static void main(String[] args) {
		new binaryButtons().creatUI();
	}

	void creatUI() {

		frame.add(panel);
		frame.setVisible(true);
		panel.add(button128);
		panel.add(button64);
		panel.add(button32);
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
		button32.addActionListener(this);
		button64.addActionListener(this);
		button128.addActionListener(this);
		buttonClear.addActionListener(this);
		frame.pack();
	}

	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed.equals(button1)) {

			if (button1.getText().equals(" ")) {
				button1.setText("1");
				sum += 1;

			} else {
				button1.setText(" ");
				sum -= 1;
			}
		}
		if (buttonPressed.equals(button2)) {
			if (button2.getText().equals(" ")) {
				button2.setText("2");
				sum += 2;
			} else {
				button2.setText(" ");
				sum -= 2;
			}
		}
		if (buttonPressed.equals(button4)) {
			if (button4.getText().equals(" ")) {
				button4.setText("4");
				sum += 4;
			} else {
				button4.setText(" ");
				sum -= 4;
			}
		}
		if (buttonPressed.equals(button8)) {
			if (button8.getText().equals(" ")) {
				button8.setText("8");
				sum += 8;
			} else {
				button8.setText(" ");
				sum -= 8;
			}
		}
		if (buttonPressed.equals(button16)) {
			if (button16.getText().equals(" ")) {
				button16.setText("16");
				sum += 16;
			} else {
				button16.setText(" ");
				sum -= 16;
			}
		}
		if (buttonPressed.equals(button32)) {
			if (button32.getText().equals(" ")) {
				button32.setText("32");
				sum += 32;
			} else {
				button32.setText(" ");
				sum -= 32;
			}
		}
		if (buttonPressed.equals(button64)) {
			if (button64.getText().equals(" ")) {
				button64.setText("64");
				sum += 64;
			} else {
				button64.setText(" ");
				sum -= 64;
			}
		}
		if (buttonPressed.equals(button128)) {
			if (button128.getText().equals(" ")) {
				button128.setText("128");
				sum += 128;
			} else {
				button128.setText(" ");
				sum -= 128;
			}
		}
		if (buttonPressed.equals(buttonClear)) {
			button1.setText(" ");
			button2.setText(" ");
			button4.setText(" ");
			button8.setText(" ");
			button16.setText(" ");
			button32.setText(" ");
			button64.setText(" ");
			button128.setText(" ");
			sum = 0;
			
		}
		label.setText("Your score is " + sum);
		frame.pack();
	}

}
