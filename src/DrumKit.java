// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

	JLabel drumImage;
	JLabel bagPipesImage;
	JLabel didgeridooImage;
	JLabel ferrariImage;

	public static void main(String[] args) throws Exception {
		new DrumKit().getGoing();
	}

	private void getGoing() throws MalformedURLException {
		// 1. Make a JFrame variable and initialize it using "new JFrame()"
		JFrame jFrame = new JFrame();
		// 2. Make the frame visible
		jFrame.setVisible(true);
		// 3. Set the size of the frame
		jFrame.setSize(800, 800);
		// 4. Set the title of the frame
		jFrame.setTitle("monkey's Uncle");
		// 5. Make a JPanel and initialize it.
		JPanel jPanel = new JPanel();
		// 6. Add the panel to the frame. (The panel is invisible.)
		jFrame.add(jPanel);
		// 7. Download an image of a drum from the Internet. Drop it into your
		// Eclipse project under "default package".
		// Done
		// 8. Put the name of your image in a String variable.
		String drumImageName = "drum.jpg";
		String bagPipesImageName = "bagPipes.jpg";
		String didgeridooImageName = "didgeridoo.jpg";
		String ferrariImageName = "ferrari.jpg";

		// 9. Use the "createImage()" method to initialize the drumImage
		// variable.
		drumImage = createImage(drumImageName);
		bagPipesImage = createImage(bagPipesImageName);
		didgeridooImage = createImage(didgeridooImageName);
		ferrariImage = createImage(ferrariImageName);
		// 10. Add the image to the panel
		jPanel.add(drumImage);
		jPanel.add(bagPipesImage);
		jPanel.add(didgeridooImage);
		jPanel.add(ferrariImage);
		// 11. Set the layout of the panel to "new GridLayout()"
		new GridLayout();
		// 12. call the pack() method on the frame
		jFrame.pack();
		// 13. add a mouse listener to your drumImage.
		drumImage.addMouseListener(this);
		bagPipesImage.addMouseListener(this); 
		didgeridooImage.addMouseListener(this);
		ferrariImage.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		// 14. When the mouse is clicked, print "mouse clicked"
		System.out.println("mouse clicked!!!");
		JLabel drumClicked = (JLabel) e.getSource();
		// 15. Download a drum sound and drop it into your "default package".
		// There are some sounds here: http://bit.ly/drum-sounds or you can also
		// get them from freesound.org
		// 16. If they clicked on the drumImage...
		if (drumClicked == drumImage){
			playSound("hardCoreDrums.wav");
		}
		if (drumClicked == bagPipesImage){
			playSound("bagPipes.wav");
		}
		if (drumClicked == didgeridooImage){
			playSound("d.wav");
		}
		if (drumClicked == ferrariImage){
			playSound("r.wav");
		}
		// 17. ...use the playSound method to play a drum sound.

		// 18. Add more images to make a drumkit. Remember to add a mouse
		// listener to each one.
	}

	private JLabel createImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet
				.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
