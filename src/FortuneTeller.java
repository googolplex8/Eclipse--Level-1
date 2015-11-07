// Copyright Wintriss Technical Schools 2013
import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FortuneTeller extends JPanel implements Runnable, MouseListener {

	BufferedImage fortuneTellerImage;

	int frameWidth = 640;
	int frameHeight = 367;

	FortuneTeller() throws Exception {
		// 1. Choose an image for your fortune teller and put it in your default
		// package
		fortuneTellerImage = ImageIO.read(getClass().getResource("hold.jpg"));
		// 2. Adjust the frameWidth and frameHeight variables to fit your image
		// nicely (doesn’t need a new line of code)
		// 4. add a mouse listener
		addMouseListener(this);
	}

	static void begin() {
		// 3. Welcome the user. Give them a hint for the secret location.
		JOptionPane.showMessageDialog(null,
				"Where would you hold onto if you were this person?");
	}

	public void mousePressed(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		// 5. Print the mouseX variable
		System.out.print(mouseX + ", ");
		// 6. Add the mouseY variable to the previous line so that it prints out
		// too (no new line)
		System.out.println(mouseY);
		// 7. Adjust your secret location co-ordinates here:
		int secretLocationX = 338;
		int secretLocationY = 155;
		/**
		 * If the mouse co-ordinates and secret location are close, we'll let
		 * them ask a question.
		 */
		if (areClose(mouseX, secretLocationX)
				&& areClose(mouseY, secretLocationY)) {
			// 8. Get the user to enter a question for the fortune teller
//			JOptionPane
//					.showInputDialog("Give me a question and I will consider answering it");
			// 9. Find a spooky sound and put it in your default package
			// (freesound.org)
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(
					"sound.wav"));
			ball();
			// 10. Play the sound
			sound.play();
			// 11. Use the pause() method below to wait until your music has
			// finished
			pause(5);
			// 12. Insert your completed Magic 8 ball recipe
			// (http://bit.ly/Zdrf6d) here
		}
	}
			public void ball(){
				Random r = new Random(4);
				int rand = r.nextInt(4);
				System.out.println(rand);
				JOptionPane.showInputDialog("Give question here");
				if(rand==0){
					JOptionPane.showMessageDialog(null, "Obvisouly");
				}
				else if (rand==1){
					JOptionPane.showMessageDialog(null, "Of course not");
				}
				else if (rand==2){
					JOptionPane.showMessageDialog(null, "Google it you fool. What do you think I am, a computer?");
				}
				else if (rand==3){
					JOptionPane.showMessageDialog(null, "Your question is not worth my time");
				}
			}
		

	

	private boolean areClose(int mouseX, int secretLocationX) {
		return mouseX < secretLocationX + 15 && mouseX > secretLocationX - 15;
	}

	private void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**************** don't worry about the stuff under here *******************/

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new FortuneTeller());
		begin();
	}

	public void run() {
		JFrame frame = new JFrame();
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	private void showAnotherImage(String imageName) {
		try {
			fortuneTellerImage = ImageIO
					.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Couldn't find this image: " + imageName);
		}
		repaint();
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(fortuneTellerImage, 0, 0, null);
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

}
