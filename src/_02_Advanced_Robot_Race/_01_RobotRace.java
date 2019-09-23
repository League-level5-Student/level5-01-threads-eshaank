package _02_Advanced_Robot_Race;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {

	public static void main(String[] args) {
		boolean topReached = false;

		Robot[] robots = new Robot[5];

		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();

			robots[i].setX(100 + (i * 400));
			robots[i].setY(900);
			robots[i].setSpeed(5);
			robots[i].show();

		}

		while (!topReached) {

			for (int i = 0; i < robots.length; i++) {
				int rand = (int) (Math.random() * 50 + 1);
				robots[i].move(rand);
				if (robots[i].getY() <= 0) {
					topReached = true;
					int winner = i + 1;
					JOptionPane.showMessageDialog(null, "Robot " + winner + " is the winner");
				}
			}
		}

	}

}