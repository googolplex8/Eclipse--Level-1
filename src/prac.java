import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;


public class prac implements MouseListener {
public static void main(String[] args) {
	new prac();
}
prac(){
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.addMouseListener(this);
}

public void mouseClicked(MouseEvent e) {
}
public void mousePressed(MouseEvent e) {
	System.out.println("Dirp");
	

	
}
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}
