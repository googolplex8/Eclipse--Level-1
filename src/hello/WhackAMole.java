package hello;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	public static void main(String[] args) {
		new WhackAMole().createUI();
	}

	JFrame frame = new JFrame("For Fame Glory and Guts!");
	JPanel panel = new JPanel();

	public void createUI() {
		int randNum = new Random().nextInt(20);
		frame.setVisible(true);
		frame.setSize(300, 300);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((dim.width / 2) - (frame.getSize().width / 2), (dim.height / 2) - (frame.getSize().height / 2));
		frame.add(panel);
		drawButton(randNum);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		if(buttonPressed.getText().equals("Mole!")){
			System.out.println("Bang!");
			speak("guts");
			frame.dispose();
			drawButton(24);
		}
		else{
			System.out.println("Woosh");
			speak("Dork Face");
			drawButton(24);
			
		}
	}
}
