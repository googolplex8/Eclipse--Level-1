public class runners {
	public static void main(String[] args) {

		Smurf handySmurf = new Smurf("handySmurf");
		handySmurf.eat();
		handySmurf.getName();
		Smurf papa = new Smurf("papa");
		System.out.println(papa.getName());
		System.out.println(papa.getHatColor());
		System.out.println(papa.isGirlOrBoy());
		Smurf Smurfette = new Smurf("Smurfette");
		System.out.println(Smurfette.getName());
		System.out.println(Smurfette.getHatColor());
		System.out.println(Smurfette.isGirlOrBoy());
}
}