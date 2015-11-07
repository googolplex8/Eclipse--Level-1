public class introToWritingMethods {
	public static void main(String[] args) {
		introToWritingMethods introToWritingMethods = new introToWritingMethods();
		introToWritingMethods.iRock();
		introToWritingMethods.rocker("TJ");
		introToWritingMethods.truth("U2");
		introToWritingMethods.echo("beer");
		introToWritingMethods.repeater("stuff", 5);
		String theBest = introToWritingMethods.getTheBestCoder();
		int answers = introToWritingMethods.adder(1,1);
		System.out.println(theBest);
		System.out.println(answers);
		boolean x = introToWritingMethods.isItEven(7);
		System.out.println(x);
	}

	void rocker(String name) {
		System.out.println(name + " Rocks");
	}

	void iRock() {
		System.out.println("Eli Rocks");
	}

	void truth(String singer) {
		if (singer.equals("U2")) {
			System.out.println(singer + " is awesome");
		} else if (singer.equals("Justin Beiber")) {
			System.out.println(singer + " sucks!");
		}
	}

	void echo(String word) {
		System.out.println(word + " " + word);
	}

	void repeater(String stuff, int repeats) {
		for (int i = 0; i < repeats; i++) {
			System.out.print(stuff + " ");
		}
		System.out.print("\n");
	}

	String getTheBestCoder() {
		return "Eli";
	}

	int adder(int a, int b) {
		int answer = a + b;
		return answer;
	}
boolean isItEven (int number){
	if (number%2==0) {
		return true;
	}
	else {
		return false;
	}
	
}
}
