package extra;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {
SkillPractice skills = new SkillPractice();
	skills.skill1();
	skills.skill2();
	skills.skill3();
	skills.skill4();
	skills.skill5();
}
void skill1() {
	String d = JOptionPane.showInputDialog("How many dimes do you have?");
	int dimes = Integer.parseInt(d);
	JOptionPane.showMessageDialog(null, "you have " + dimes*10 + " cents");
	String in = JOptionPane.showInputDialog("How tall are you in inches?");
	int height = Integer.parseInt(in);
	if (height<36) {
		JOptionPane.showMessageDialog(null, "Eat your Wheaties, child");
	}
	else {
		JOptionPane.showMessageDialog(null, "You are tall");
	}
}
void skill2() {
	for (int i = 0; i < 31; i+=3) {
		System.out.print(i + " ");
	}
	System.out.println("");
}
void skill3() {
	int r = 0;
	Random rand = new Random(); //nextInt(25): range from 0-24 
	 r = rand.nextInt(20);  //nextInt(25)+25: (big-small)+small: 25-49
	System.out.println(r);
	int n = 0;
	Random number = new Random();
	 n = number.nextInt(10);
	System.out.println(n);
	if (r>n) {
		JOptionPane.showMessageDialog(null, "The difference between " + r + " and " + n + " is " + (r-n));
	}
	else {
		JOptionPane.showMessageDialog(null, "The difference between " + r + " and " + n + " is " + (n-r));
	}
	
}
void skill4() {
	String city = JOptionPane.showInputDialog("What city do you live in?");
	if (city.equalsIgnoreCase ("San Diego")) { //use .equals to see if value is same
											//but object is not exactly the same
											//ex: san diego - San Diego
		JOptionPane.showMessageDialog(null, "You live in America's Finest City");
	}
	else {
		JOptionPane.showMessageDialog(null, "You should move to San Diego");
	}

	String c = JOptionPane.showInputDialog("How many cars does your family have");
	int cars = Integer.parseInt(c);
	if (cars == 0) {
		JOptionPane.showMessageDialog(null, "I bet you use public transportation");
	}
	else if (cars == 1) {
		JOptionPane.showInputDialog("What model of your car is it?");
	}
	else {
		JOptionPane.showInputDialog("how many car wheels do you have in total?");
	}
}
void skill5() {
	String school = JOptionPane.showInputDialog("What school do you go to?");
	JOptionPane.showMessageDialog(null, school + " is a fantastic school!");
}



}
