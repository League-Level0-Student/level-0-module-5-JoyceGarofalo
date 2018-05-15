package extra;

import javax.swing.JOptionPane;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		/*
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		//
		for (int i = 100; i > -1; i--) {
			System.out.println(i);
		}
		//
		for (int i = 2; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		//
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		//
		for (int i = 1; i < 501; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}
		}
		//
		for (int i = 7; i < 778; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
		//7
		String year = JOptionPane.showInputDialog("what year were you born?");
		int yr = Integer.parseInt(year);
		for (int i = yr; i < 2019; i++) {
			System.out.println("In " + i + ", I turned " + (i - yr));
		}
		//1
		for (int i = 0; i < 3; i++) {
			int num1 = i;
			for (int j = 0; j < 3; j++) {
				System.out.println(num1 + " " + j);
			}
		}
		*/
		//2
		for (int j = 1; j < 8; j+=3) {
		for (int i = j; i < j+3; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		}
		
		//3
		for (int i = 1; i < 101; i+=10) {
			for (int j = i; j < i+10; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		//4
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < i+1; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		//bonus
		for (int i = 0; i < 101; i++) {
			System.out.println(100-i);
			
		}
		
	}
}
