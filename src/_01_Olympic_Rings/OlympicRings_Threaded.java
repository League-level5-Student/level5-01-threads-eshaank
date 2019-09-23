package _01_Olympic_Rings;

import java.awt.Color;
import java.util.ArrayList;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {

	public static void main(String[] args) {
		Robot blue = new Robot(500, 400);
		Robot black = new Robot(800, 400);
		Robot red = new Robot(1100, 400);
		Robot yellow = new Robot(700, 600);
		Robot green = new Robot(950, 600);
		
		green.setPenColor(Color.GREEN);
		blue.setPenColor(Color.BLUE);
		black.setPenColor(Color.BLACK);
		red.setPenColor(Color.RED);
		yellow.setPenColor(Color.YELLOW);
		
		ArrayList<Robot> robots = new ArrayList<>();
		robots.add(green);
		robots.add(blue);
		robots.add(black);
		robots.add(red);
		robots.add(yellow);
		
		for(Robot r : robots) {
			Thread robs = new Thread(() -> drawCircle(r));
			robs.start();
		}
		
		}
	static void drawCircle(Robot rob){
		for (int i = 0; i < 120; i++) {
			rob.setSpeed(2);
			rob.penDown();
			rob.move(10);
			rob.turn(3);
			rob.hide();
			rob.setPenWidth(10);
		}
	}
}
