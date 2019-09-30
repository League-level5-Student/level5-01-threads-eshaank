package _02_Advanced_Robot_Race;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace1 {
public static void main(String[] args) {
	Robot r1 = new Robot(100, 900);
	Robot r2 = new Robot(500, 900);
	Robot r3 = new Robot(900, 900);
	Robot r4 = new Robot(1300, 900);
	Robot r5 = new Robot(1700, 900);
	
	ArrayList<Robot> robotRacers = new ArrayList<>();
	robotRacers.add(r1);
	robotRacers.add(r2);
	robotRacers.add(r3);
	robotRacers.add(r4);
	robotRacers.add(r5);


	
	for(Robot rob: robotRacers) {
		Thread r = new Thread(() -> robRace(robotRacers)); 
	}
}
static void robRace(ArrayList<Robot> robs) {
	boolean topReached = false;
	for (int i = 0; i < robs.size(); i++) {
		robs.get(i).setSpeed(5);
		robs.get(i).show();

	}

	while (!topReached) {
		for (int i = 0; i < robs.size(); i++) {
			int rand = (int) (Math.random() * 50 + 1);
			robs.get(i).move(rand);
			if (robs.get(i).getY() <= 0) {
				topReached = true;
				int winner = i + 1;
				JOptionPane.showMessageDialog(null, "Robot " + winner + " is the winner");
			}
		}
	}
}
}
