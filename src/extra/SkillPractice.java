package extra;

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
}
void skill2() {
	for (int i = 0; i < 31; i+=3) {
		System.out.println(i);
	}
}
void skill3() {
	int r = 0;
	Random rand = new Random(); //nextInt(25): range from 0-24 
	int r = rand.nextInt(21);  //nextInt(25)+25: (big-small)+small: 25-49
	System.out.println(r);
	int n = 0;
	Random number = new Random();
	int n = rand.nextInt(11);
	System.out.println(n);
	JOptionPane.showMessageDialog(null, message);
}




}
