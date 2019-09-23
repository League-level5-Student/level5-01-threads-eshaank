package _02_Advanced_Robot_Race;

import java.util.ArrayList;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	static // Re-do the robot race recipe from level 3 module 0.
	// This time, use threads to make all of the robots go at the same time.
	boolean topReached = false;

	public static void main(String[] args) {

		Robot r = new Robot();
		Robot r1 = new Robot();
		Robot r2 = new Robot();
		Robot r3 = new Robot();
		Robot r4 = new Robot();
		
		ArrayList<Robot> robots = new ArrayList<>();
		robots.add(r);
		robots.add(r1);
		robots.add(r2);
		robots.add(r3);
		robots.add(r4);
		
		for(Robot robs: robots) {
			robRace(robs);
		}
	}

	static void robRace(Robot robots) {

		
		robots.setY(900);
		robots.setSpeed(5);
		robots.show();

		while (!topReached) {

			int rand = (int) (Math.random() * 50 + 1);
			robots.move(rand);
			System.out.println(rand);
			if (robots.getY() <= 0) {
				topReached = true;
			}
		}
	}
}
