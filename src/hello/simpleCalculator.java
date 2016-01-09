package hello;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class simpleCalculator {
	JTextField text1 = new JTextField("Enter a number here");
	JTextField text2 = new JTextField("Enter a number here");
	JButton add = new JButton("add");
	JButton subtract = new JButton("subtract");
	JButton multiply = new JButton("multiply");
	JButton divide = new JButton("divide");
	JLabel label = new JLabel("Your answer should appear here");
	JFrame frame = new JFrame("Philosophical Calculator");
	JPanel panel = new JPanel();
	
	public void createUI() {

	}

	public static void main(String[] args) {

	}
}
