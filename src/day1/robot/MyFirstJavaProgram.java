package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot bot = new Robot();
bot.setPenColor(Color.blue);


bot.setSpeed(10);
bot.penDown();

for (int i = 0; i < 4; i++) {
	bot.move(250);
	bot.turn(90);

}
bot.turn(180);
for (int i = 0; i < 4; i++) {
	bot.move(250);
	bot.turn(90);



	}
bot.turn(180);
for (int i = 0; i < 4; i++) {
	bot.move(250);
	bot.turn(-90);



	}
}}
