import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StephenHawking implements KeyListener {

	public static void main(String[] args) {
		new StephenHawking();
	}

	StephenHawking() {
		JFrame frame = new JFrame();
		frame.addKeyListener(this);
		frame.setVisible(true);
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void keyTyped(KeyEvent e) {

	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_0) {
			speak("OUCH!");
		}

	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

// Copyright Wintriss Technical Schools 2014