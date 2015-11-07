import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pigLatinConverter implements ActionListener {
	JFrame frame = new JFrame("Pig Latin Converter");
	JPanel panel = new JPanel();
	JButton button = new JButton("Convert");
	JTextField english = new JTextField(20);
	JTextField pigLatin = new JTextField(20);
	PigLatinTranslator trans = new PigLatinTranslator();
	public static void main(String[] args) {
		new pigLatinConverter().createUI();

	}
	void createUI() {
		
		frame.setVisible(true);
		panel.add(english);
		panel.add(button);
		panel.add(pigLatin);
		frame.add(panel);
		button.addActionListener(this);
		frame.pack();
	}
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed.equals(button)){
			trans.translate(english.getText());
			pigLatin.setText(trans.translate(english.getText()));
		}
		
	}
}