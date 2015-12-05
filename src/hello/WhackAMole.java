package hello;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	public static void main(String[] args) {
		new WhackAMole().createUI();
	}

	JFrame frame = new JFrame("For Fame Glory and Guts!");
	JPanel panel = new JPanel();
	int misses = 0;
	int clicks = 0;
	int points = 0;

	public void createUI() {
		frame = new JFrame("For Fame Glory and Guts!");
		panel = new JPanel();
		int randNum = new Random().nextInt(20);
		frame.setSize(300, 300);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((dim.width / 2) - (frame.getSize().width / 2), (dim.height / 2) - (frame.getSize().height / 2));
		frame.add(panel);
		drawButton(randNum);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void drawButton(int num) {
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			button.addActionListener(this);
			if (i == num) {
				button.setText("Mole!");
			}
			panel.add(button);

		}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed.getText().equals("Mole!")) {
			System.out.println("Bang!");
			speak("glory");
			frame.dispose();
			createUI();
			points += 1;
			done();
		} else {
			System.out.println("Woosh");
			insult();
			reload();
			done();
		}
	}

	public void reload() {
		if (misses == 4) {
			frame.dispose();
			misses = 0;
			createUI();
		}
		else{
			misses+=1;
		}
	}

	public void done() {
		if (clicks == 10) {
			frame.dispose();
			JOptionPane.showMessageDialog(null, "Your score is " + points);
		}else{
			clicks++;
		}
	}

	public void insult() {
		if (misses == 1) {
			speak("Dork Face");
		}
		if (misses == 2) {
			speak("noob");
		}
		if (misses == 3) {
			speak("Mor ran");
			misses++;
		}
	}
}
