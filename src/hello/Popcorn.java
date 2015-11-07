package hello;

public class Popcorn {
public static void main(String[] args) {
	Microwave microwave = new Microwave();
	Popcorn popcorn = new Popcorn("Cheese");
	microwave.putInMicrowave(popcorn);
	microwave.setTime(2);
	microwave.startMicrowave();
	popcorn.applyHeat();
}
	private int kernels = 20;
	private String flavor;

	Popcorn(String flavor) {
		this.flavor = flavor;
		System.out.println("Popcorn says: making package of " + this.flavor + " popcorn.");
	}


	public void applyHeat() {
		pause();

		if (kernels == 0) {
			System.out.println("Popcorn says: Time to eat popcorn!");
		} else {
			System.out.println("POP!" + kernels);
			kernels--;
		}
	}

	private void pause() {
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

