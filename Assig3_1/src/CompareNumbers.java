//OK. O.Aktunc
//Use more descriptive variable names
//first instead of f, largest instead of big


//Neli Romero
//EG 1305-Spring 2015
//Assignment 3 Program 1
import java.util.Scanner;


public class CompareNumbers {
	
	public static void main(String[] arg) {
		//Statements to gather the information of the integers
		System.out.println("Enter first integer: "); 
		Scanner input = new Scanner(System.in);
		int f = input.nextInt();
		
		System.out.println("Enter second integer: "); 
		int s = input.nextInt();
		
		System.out.println("Enter third integer: "); 
	    int t = input.nextInt();
		
		System.out.println("For the numbers: " +f +", " +s +", and " +t); 
		
		//If statements to find out which one is bigger and which one is smaller 
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
		//Equation to find the sum
		int sum = f + s +t;
		System.out.println("Sum is " +sum ); 
		//Equation to find the product
		int product = f * s * t; 
		System.out.println("Product is " +product ); 
		//Equation to find the average
		int average = (f + s +t)/ 3;
		System.out.println("Average is  " +average ); 
}

	
}
