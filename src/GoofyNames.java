/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
String name = JOptionPane.showInputDialog("What is your name?");
System.out.println(name.toUpperCase());

		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.

		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number of characters in the String.
for (int i = 0; i < name.length(); i++) {
	System.out.println(name.charAt(i));
	//.length() is number of characters in the word. Because you start counting from 0,
	//i stops at the digit before the length number. charAt(i) prints the number
	//located in position i, or whatever is put in the parenthesis

	String output = "";
String character= name.substring(i,i+1); //creates a new string before the first digit (0) and before the next (1). other numbers can be put here.
										//You want to chop every letter so you put i and i+1 for each time i changes.
if (i%2 == 0) {
	output = character.toUpperCase(); //always save information into a string variable
	
}
else {
	output = character.toLowerCase();
}
goofyName += output;  //step 6 --- add the output to goofyName and make it equal to
			// 4. Create a String variable to store the next character of the name
			//    using .substring(start, end)
			//    HINT: replace 'start' and 'end' to get String with character at i 
			
			// 5. Use MODULO to set this variable to upper case for EVEN characters
			//    and lower case for ODD characters.

			
			// 6. ADD this String  (containing 1 char) to the goofyName String

}
		// 7. Use pop-up to show user their Goofy name
System.out.println(goofyName);
	}
}

