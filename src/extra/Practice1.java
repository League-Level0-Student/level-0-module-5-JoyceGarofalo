package extra;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Practice1 {
public static void main(String[] args) {
	for (int i = 15; i > 4; i--) {
		System.out.print(i + " ");
	}
	int length = 2;
	int num = length + 4;
	String userInput = "9";
	int nhf = Integer.parseInt(userInput);
	String jigsaw = JOptionPane.showInputDialog("puzzle?");
	Robot rob = new Robot();
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	String nice = null;
	String person = null;
	if (person == nice) {
		JOptionPane.showMessageDialog(null, "holla");
	}
	else {
		JOptionPane.showMessageDialog(null, "run away");
	}
	System.out.println("hi");
	int lucysHeight = 0;
	int jimmysHeight = 0;
	if (lucysHeight > jimmysHeight) {
		JOptionPane.showMessageDialog(null, "lucy is taller");
	}
	else {
		JOptionPane.showMessageDialog(null, "jimmy is taller");
	}
	String momsName = JOptionPane.showInputDialog("What is yoru mom's name?");
	JOptionPane.showMessageDialog(null, "Good Morning " + momsName);
	int r = 0;
	Random rand = new Random();
	r = rand.nextInt(20);
	System.out.println(r);
	int nu = 0;
	if (nu%2 == 0) {
		System.out.println(num + " is even");
	}
	else {
		System.out.println(num + "is odd");
	}
	for (int i = 0; i < 100000001; i++) {
		void spinInACircle() {
			robot.turn(360);
		
		}
	}
}
}
