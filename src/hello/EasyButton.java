package hello;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EasyButton implements ActionListener {
	EasyButton() {
		showEasyButton();

		// easyButtonImage.addMouseListener(this);

	}

	public static void main(String[] args) {
		new EasyButton();
	}

	JLabel easyButtonImage;
	JFrame quizWindow = new JFrame();
	
	JPanel panel = new JPanel();
	JButton button = new JButton("Button");
	JButton button2 = new JButton("Button 360 no scope");

	private void showEasyButton() {

		// button.addMouseListener(this);
		button.addActionListener(this);
		button2.addActionListener(this);
		quizWindow.add(panel);
		panel.add(button);
		panel.add(button2);
		quizWindow.setVisible(true);
		URL url = null;
		try {
			url = new URL(
					"https://github.com/jointheleague/league-images/blob/master/easy_button.jpg?raw=true");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Icon icon = new ImageIcon(url);
		this.easyButtonImage = new JLabel(icon);
		// quizWindow.add(easyButtonImage);
		quizWindow.pack();
	}

	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void mouseClicked(MouseEvent e) {
		speak("That was mildly difficult");

	}

	public void actionPerformed(ActionEvent e) {
		//System.out.println(e.getSource());
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed.equals(button)) {
			System.out.println("button");
		}
		if (buttonPressed.equals(button2)) {
			System.out.println("button2");
		}
	}

}
