import javax.swing.JOptionPane;


public class Try1 {
public static void main(String[] args) {
	String year = JOptionPane.showInputDialog("What year were you born in?");
	int yearint = Integer.parseInt(year);
	if (yearint<=1921 && yearint>=1912){
		JOptionPane.showMessageDialog(null, "You are part of the Depression Generation.");
	}
	else if (yearint<=1927 && yearint >= 1922){
		JOptionPane.showMessageDialog(null, "You are part of the World War II Generation.");
	}
	else if (yearint<=1945 && yearint >= 1928){
		JOptionPane.showMessageDialog(null, "You are part of the Post War Cohort Generation.");
	}
	else if (yearint<=1954 && yearint >= 1946){
		JOptionPane.showMessageDialog(null, "You are part of the Baby Boomer Generation.");
	}
	else if (yearint<=1965 && yearint >= 1955){
		JOptionPane.showMessageDialog(null, "You are part of the Generation Jones Era.");
	}
	else if (yearint<=1976 && yearint >= 1966){
		JOptionPane.showMessageDialog(null, "You are part of Generation X.");
	}
	else if (yearint<=1994 && yearint >= 1977){
		JOptionPane.showMessageDialog(null, "You are part of Generation Y or the Millenniums.");
	}
	else if (yearint<=2012 && yearint >= 1995){
		JOptionPane.showMessageDialog(null, "You are part of Generation Z.");
	}
	else if (yearint>2012){
		JOptionPane.showMessageDialog(null, "You are too young to be part of a generation.");
	}
	else{
		JOptionPane.showMessageDialog(null, "Your old like dust, did you ride dinosaurs to school?");
	}
}
}
