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

	JFrame frame = new JFrame("Happy New Year");
	JPanel panel = new JPanel();
	JButton happy = new JButton("HAPPY");
	JButton hanukkah = new JButton("New Year");

	public void createUI() {
		//System.out.println("CreateUI");
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
		if (buttonPressed == happy) {
			System.out.println("worked");
			showPictureFromTheInternet("https://cdn2.vox-cdn.com/thumbor/8524SwpGsBzjFvWsZxtWvnKxRwE=/cdn0.vox-cdn.com/uploads/chorus_asset/file/3615226/PIA17936_fig1.0.jpg");

		}
		if (buttonPressed == hanukkah) {
			System.out.println("worked");
			showPictureFromTheInternet("http://www.eonline.com/eol_images/Entire_Site/201438/rs_560x415-140408154504-1024.baby-elephant-grass.ls.4814.jpg");

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
