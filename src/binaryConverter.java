import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binaryConverter implements ActionListener {
	JFrame frame = new JFrame("Give me Binary or give me death");
	JPanel panel = new JPanel();
	JButton button = new JButton("Convert");
	JTextField answer = new JTextField(20);
	JTextField question = new JTextField(20);
	public static void main(String[] args) {
		new binaryConverter().createUI();

	}
	void createUI() {
		
		frame.setVisible(true);
		panel.add(question);
		panel.add(button);
		panel.add(answer);
		frame.add(panel);
		button.addActionListener(this);
		frame.pack();
	}

	String convert(String binary) {
		int ascii = Integer.parseInt(binary, 2);
		char theLetter = (char) ascii; 
		return "" + theLetter;
	}

	public void actionPerformed(ActionEvent e) {
		//JButton buttonPressed = (JButton) e.getSource();
//		if (buttonPressed.equals(button)) {
//			
//		}
		answer.setText(convert(question.getText()));             
	}

}