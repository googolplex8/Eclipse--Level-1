package hello;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TypingGame implements KeyListener {
	char currentLetter = generateRandomLetter();
	JFrame frame = new JFrame("Type or Die");
	JLabel label = new JLabel(currentLetter + "");
	int score = 0;
	Date timeAtStart;

	public static void main(String[] args) {
		new TypingGame().createUI();
	}

	void createUI() {
		frame.pack();
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.add(label);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void keyPressed(KeyEvent e) {
		System.out.println("you typed: " + e.getKeyChar());
		if (timeAtStart == null) {
			timeAtStart = new Date();
		}
		if (e.getKeyChar() == (currentLetter)) {
			System.out.println("Correct");
			frame.getContentPane().setBackground(Color.GREEN);
			score += 1;
		} else if (e.getKeyChar() != (currentLetter)) {
			System.out.println("Incorrect");
			frame.getContentPane().setBackground(Color.RED);

		}
	}

	public void keyReleased(KeyEvent e) {
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			showTypingSpeed(score);
		}

	}

	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		System.out.println(gameInSeconds);
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
		timeAtStart = null;
	}
}
