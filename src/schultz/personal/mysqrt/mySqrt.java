package schultz.personal.mysqrt;

import java.util.Scanner;

public class mySqrt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter square root: ");
		
		int input = scanner.nextInt();
		
		System.out.println(mySqrtInt(input));
	}
	
	public static double mySqrt(int x) {
		if(x == 0)
			return 0;
		if(x < 0)
			return -1;
		
		double guess = x;
		
		for(int i = 0; i < 1000; i++)
			guess = (guess + (x/guess))/2;
		
		return guess;
	}
	
	// integer only output
	public static int mySqrtInt(int x) {
		for(int i = 1; i <= x; i++) {
			if(Math.pow(i, 2) == x)
				return i;
			
			else if(Math.pow(i, 2) > x)
				return i - 1;
		}
		
		return -1;
	}

}
