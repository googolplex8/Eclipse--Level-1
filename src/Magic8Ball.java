import java.util.Random;

import javax.swing.JOptionPane;


public class Magic8Ball {
public static void main(String[] args) {
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
}
