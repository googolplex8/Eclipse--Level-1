
public class PersonGetSet {
int name;
boolean hasSuperPower;

PersonGetSet(int name, boolean hasSuperPower){
	this.name=name;
	this.hasSuperPower=hasSuperPower;
}
public static void main(String[] args) {
	PersonGetSet Phill = new PersonGetSet(33, false);
}
int getName(){
	return name;
}
void setName(int newName){
	name=newName;
}
boolean getHasSuperPower(){
	return hasSuperPower;
}
void setHasSuperPower(boolean newHasSuperPower){
	hasSuperPower=newHasSuperPower;
}
@Override
	public String toString() {
		
		return ("Your name is "+ name + " and your superpower is " + hasSuperPower);
	}
}
