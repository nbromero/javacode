import java.util.Scanner;


public class CompareNumbers {
	
	public static void main(String[] arg) {
		
		System.out.println("Enter first integer: "); 
		Scanner input = new Scanner(System.in);
		int f = input.nextInt();
		
		System.out.println("Enter second integer: "); 
		int s = input.nextInt();
		
		System.out.println("Enter third integer: "); 
	    int t = input.nextInt();
		
		System.out.println("For the numbers: " +f +", " +s +", and " +t); 
		
		 int big = 0;
		if (f > s ) {
			big = f;
		}else if (t > f){
			big = t; 
		}
		
		 int small = 0;
			if (f  < s ) {
				small = f;
			}else if (s < t ){
				small = s; 
			}
		
		System.out.println("Largest is " +big ); 
		System.out.println("Smallest is " +small ); 
		
		int sum = f + s +t;
		System.out.println("Sum is " +sum ); 
		
		int product = f * s * t; 
		System.out.println("Product is " +product ); 
		
		int average = (f + s +t)/ 3;
		System.out.println("Average is  " +average ); 
}

	
}