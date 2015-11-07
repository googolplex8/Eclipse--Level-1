import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class fortuneCookie implements ActionListener{
public static void main(String[] args) {
	new fortuneCookie().createUI();
}
JButton button = new JButton("Click here to recieve your fortune!");
JFrame frame = new JFrame("Fortune Cookie");
JPanel panel = new JPanel();
public void createUI(){
	frame.add(panel);
	panel.add(button);
	frame.setVisible(true);
	button.addActionListener(this);
	frame.pack();
}
public void actionPerformed(ActionEvent arg0) {
	int rand = new Random().nextInt(5);
	JButton buttonClicked = (JButton) arg0.getSource();
	
}
}
