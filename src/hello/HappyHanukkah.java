package hello;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HappyHanukkah implements ActionListener {
public static void main(String[] args) {
	new HappyHanukkah().createUI();
}
JFrame frame = new JFrame("Happy Hanukkah");
JPanel panel = new JPanel();
JButton happy = new JButton("HAPPY");
JButton hanukkah = new JButton("HANUKKAH");
public void createUI(){
	frame.setVisible(true);
	frame.add(panel);
	panel.add(happy);
	panel.add(hanukkah);
	hanukkah.addActionListener(this);
	happy.addActionListener(this);
	frame.pack();
	
}
public void actionPerformed(ActionEvent e) {
JButton buttonPressed = (JButton) e.getSource();
if (buttonPressed==happy) {
	showPictureFromTheInternet("https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&ved=0ahUKEwjFkc-ao9XJAhXEKiYKHfilA0sQjRwIBw&url=http%3A%2F%2Fdesignxhome.webcam%2Fdecors%2Fhappy&psig=AFQjCNHjjM7uKAErn8vrINSptOuYMVUPcg&ust=1449973722297578");
}
if (buttonPressed==hanukkah) {
	
}
}
private void showPictureFromTheInternet(String imageUrl) {
	try {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		JFrame frame = new JFrame();
		frame.add(imageLabel);
		frame.setVisible(true);
		frame.pack();
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
}

}
