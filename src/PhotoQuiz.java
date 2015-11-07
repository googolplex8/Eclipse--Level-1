// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		int score = 0;
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// ÒCopy Image URLÓ)
		String url = "http://s.ngm.com/2014/03/black-holes/img/black-holes-opener-615.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component imageComp;
		// 3. use the "createImage()" method below to initialize your Component
		imageComp = createImage(url);
		// 4. add the image to the quiz window
		quizWindow.add(imageComp);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String q = JOptionPane.showInputDialog("Will the planet escpae?");
		// 7. print "CORRECT" if the user gave the right answer
		if (q.equals("42")) {
			JOptionPane.showMessageDialog(null, "Correct!!!");

			score += 1;
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "Wrong!!!");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(imageComp);
		// 10. find another image and create it
		String url2 = "http://www.brownspaceman.com/wp-content/uploads/2013/09/White_Hole.jpg";
		// 11. add the second image to the quiz window
		imageComp = createImage(url2);
		quizWindow.add(imageComp);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String q2 = JOptionPane.showInputDialog("Will the planet escpae?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (q2.equals("no")) {
			JOptionPane.showMessageDialog(null, "Correct!!!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!!!");
		}
		quizWindow.remove(imageComp);
		String url3 = "http://www.daviddarling.info/images/galactic_black_hole.jpg";
		imageComp = createImage(url3);
		quizWindow.add(imageComp);
		quizWindow.pack();
		String q3 = JOptionPane.showInputDialog("Will the planet escpae?");
		if (q3.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Correct!!!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!!!");
		}
		JOptionPane.showMessageDialog(null, "Your IQ is " + score
				+ " and you will live " + score + " more years");
	}

	private static void imageComp() {
		// TODO Auto-generated method stub

	}

	private static Component createImage(String imageUrl)
			throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
