public class Dolphin {

	String color;
	int numteeth;

	public Dolphin(String color, int numteeth) {
		this.numteeth = numteeth;
		this.color = color;
	}

	void swim() {
		System.out.println("Fin swims 300 meter.");
		eat();
	}

	void eat() {
		System.out.println("Fin eats 300 minos");
	}
	
	int getNumTeeth(){
		return numteeth;
	}

	public static void main(String[] args) {
		Dolphin fin = new Dolphin("grey", 300);
		fin.swim();
	System.out.println(fin.getNumTeeth());
	}
}
