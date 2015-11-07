import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and
	// fill
	// in their paths here. To get the path, right click on the image, and copy
	// its Location.
	String firstImage = "/Users/eli/Desktop/1353101416BOONE_SPEED_063009131Edit.jpg";
	String secondImage = "/Users/eli/Desktop/harrison-ford-enders-game.jpg";
	String thirdImage = "/Users/eli/Desktop/adam_weishaupt.jpg";

	Frame window = new Frame();

	private void startQuiz() {
		// Set the size of the window so that you can only see part of the
		// image.
		window.setSize(500, 500);
		// Make an int variable to hold the score.
		int score = 0;
		// Ask the user who this person is and store their answer

		// If they got the answer right:
		// -- Tell them they are correct.
		// -- Increase the score by 1
		String name1 = JOptionPane.showInputDialog("Who is this?");
		if (name1.equals("Chris Sharma")) {
			JOptionPane.showMessageDialog(null, "You Are Right!");
			score += 1;
			showNextImage();
		} else {

			JOptionPane.showMessageDialog(null, "You Are Wrong!");
			showNextImage();
		}
		String name2 = JOptionPane.showInputDialog("Who is this?");
		if (name2.equals("Harrison Ford")) {
			JOptionPane.showMessageDialog(null, "You Are Right!");
			score += 1;
			showNextImage();
		} else {

			JOptionPane.showMessageDialog(null, "You Are Wrong!");
			showNextImage();

		}
		String name3 = JOptionPane.showInputDialog("Who is this?");
		if (name3.equals("Adam Weishaupt")) {
			JOptionPane.showMessageDialog(null, "You Are Right!");
			score += 1;
			showNextImage();
		} else {

			JOptionPane.showMessageDialog(null, "You Are Wrong!");
			showNextImage();
		}
		JOptionPane.showMessageDialog(null, "Your score is " + score);
		// -- Tell them they are wrong

		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}
