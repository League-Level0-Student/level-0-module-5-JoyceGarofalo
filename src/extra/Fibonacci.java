package extra;

public class Fibonacci {
public static void main(String[] args) {
	 
	int num1 = 0;
	int num2 = 1;
	int sum = num1+num2;
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(sum);
	for (int i = 0; i < 10; i++) {
	num1 = num2;
	num2 = sum;
	sum = num1+num2;
	System.out.println(sum);
		
	
		
		
	}
}
}
