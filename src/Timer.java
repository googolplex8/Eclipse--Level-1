
public class Timer {
String color;
int timeLength;
Timer(String color, int timeLength){
	this.color=color;
    this.timeLength=timeLength;
}

	public String toString() {
		// TODO Auto-generated method stub
		return "Our ear-splitting timer is the ugly color " + color + " and can count down from up to "+ timeLength;
	}
}
