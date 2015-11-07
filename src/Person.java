import javax.swing.JOptionPane;

public class Person {
	public static void main(String[] args) {
		System.out.println(getNameTag("Eli"));
	}

	public static String getNameTag(String name) {
		String nameOfNames = "My name is " + name;
		return nameOfNames;

	}
}
