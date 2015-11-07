public class Monkey {

	String ferocityLevel;
	boolean eatsBannanaPie;
	int numUncles;

	Monkey(int numUncles, boolean eatsBannanaPie) {
		this.numUncles = numUncles;
		this.eatsBannanaPie = eatsBannanaPie;
	}

	public void sound() {
		System.out.println("The monkey farts 80 times.");
	}

	public void bannanasThrown() {
		System.out.println("800 bannanas are thrown.");
	}

	public void swings() {
		System.out.println("The monkey swings from 8 trees.");
	}
}
