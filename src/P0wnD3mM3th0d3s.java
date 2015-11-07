import java.awt.Color;

import org.teachingextensions.logo.Colors.Oranges;
import org.teachingextensions.logo.Tortoise;


public class P0wnD3mM3th0d3s {
public static void main(String[] args) {
	P0wnD3mM3th0d3s P0wnD3mM3th0d3s = new P0wnD3mM3th0d3s();
	P0wnD3mM3th0d3s.food("stonefruit");
	P0wnD3mM3th0d3s.truth(4);
	
	P0wnD3mM3th0d3s.jump(6);
	P0wnD3mM3th0d3s.jump("piggy");
	P0wnD3mM3th0d3s.drawLine();
	
}
void food(String fruit) {
	System.out.println("I like " + fruit);
}
void truth(int x) {
if(x > 5)
		System.out.println("Geeks rule");
	else
		System.out.println("Nerds rule");
}

void jump(int height) {
	if (height > 100)
		System.out.println("The mouse jumped over the moon.");
if (height > 50)
System.out.println("The mouse jumped over the broom.");
if (height > 5) 
System.out.println("The mouse jumped over the candlestick.");
}


void jump(String obstacle) {
	System.out.println("The mouse jumped over the " + obstacle);
}



void drawLine() {
	Tortoise.setSpeed(10);
	for (int i = 0; i < 4; i++) {
		Tortoise.setPenColor(Color.cyan);
		Tortoise.move(10);
		Tortoise.turn(90);
		
	}
	
}
}
