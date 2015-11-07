
public class Disease {
boolean isPandemic;
String symptoms;
float chanceOfSurvival;

Disease(boolean isPandemic, String symptoms, double chaceOfSurvival){
	this.isPandemic=isPandemic;
	this.symptoms=symptoms;
	this.chanceOfSurvival=chanceOfSurvival;
}
public static void main(String[] args) {
	//new Disease().stuff();
}
public void stuff(){
	Disease plague = new Disease(true, "pain", 7.11);
	System.out.println(isPandemic + symptoms + chanceOfSurvival);
}
}
