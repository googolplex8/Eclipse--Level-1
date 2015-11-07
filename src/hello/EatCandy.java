package hello;

public class EatCandy {
public static void main(String[] args) {
Person Eli = new Person("Eli");
Candy chocolate = new Candy(12, "Hershey", true);
Eli.unwrap(chocolate);
Eli.smell(chocolate);
Eli.chew(chocolate);
}
}
 class Candy {
String brand;
double productNumber;
boolean hadAroma;

Candy(double productNumber, String brand, boolean hasAroma){
	this.brand=brand;
	this.productNumber=productNumber;
	this.hadAroma=hasAroma;
}
}

class Person {
String name;
	Person(String name) {
this.name=name;
	}
void unwrap (Candy candy){
	System.out.println("You have successfully unwrapped a candy");
}
void smell (Candy candy){
	System.out.println("You have successfully smelt a candy");
}
void chew (Candy candy){
	System.out.println("You have successfully chewed a candy");
}
}
