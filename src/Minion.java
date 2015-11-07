public class Minion {
	private String name;
	private int eyes;
	private String color;
	private String master;
	
	Minion(String name, int eyes, String color, String master){
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}
	
	String getName(){
		return name;
	}
	void setName(String newName){
		name = newName;
	}
	String getColor(){
		return color;
	}
	void setColor(String newColor){
		color = newColor;
	}
	String getMaster(){
		return master;
	}
	void setMaster(String newMaster){
		master = newMaster;
	}
	int getEyes(){
		return eyes;
	}
	void setEyes(int newEyes){
		eyes = newEyes;
	}
}
