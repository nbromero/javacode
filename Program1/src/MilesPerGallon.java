//Neli Romero
//EG 1305-Spring 2015
// Program 1


import java.util.Scanner;


public class MilesPerGallon {
	public static void main(String[] arg) {

		//Introducing the scanner functions and the variables for the program
		
		System.out.println("How many miles were driven?"); //ask the user for the miles
		Scanner input = new Scanner(System.in); 
		int m = input.nextInt();
		System.out.println("How many gallons of gas were used?"); // ask the user for the gallons
		double g = input.nextDouble();
		
		double miles_gallon = m / g; //the function in order to be able to state the miles per gallon
		
		System.out.println("Your miles per gallon is: " +miles_gallon); //your end result 
		
		
		System.exit(0);	
}

}
