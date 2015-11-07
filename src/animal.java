import javax.swing.JOptionPane;

public class animal {
	public String type;
	public int size;
	public boolean isOnEarth;

	public static void main(String[] args) {
		animal bug = new animal("bug", 6, false);
		bug.fly();
		animal giraffe = new animal("giraffe", 5, true);
		giraffe.eat();
	}

	animal(String type, int size, boolean isOnEarth) {
		this.type = type;
		this.size = size;
		this.isOnEarth = isOnEarth;

	}

	void setType(String type) {
		this.type = type;
	}

	String getType() {
		return type;
	}

	public void fly() {
		System.out.println("I fly");
	}
	public void eat(){
		System.out.println("I eat");
	}
}