import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	String value = JOptionPane.showInputDialog("Is this number prime?");
	int number = Integer.parseInt(value);
	for (int i = 2; i < number; i++) {
	
	if (number%i ==0) { 
		//number entered divided by all numbers between 2 and number
		JOptionPane.showMessageDialog(null, "Not prime");
		System.exit(0); //ends program
	}

}
	JOptionPane.showMessageDialog(null, number + " is prime");
	
}
}
