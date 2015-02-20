//Neli Romero
//EG 1305-Spring 2015
//Assignment 4 Question 1

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
	public static void main(String[] arg) {

		int user = 0;
		int computer;

		Random generator = new Random();
		computer = generator.nextInt(100) + 1;

		System.out.println("Enter a number between 1 and 100.");
		Scanner scan = new Scanner(System.in);

		while (computer != user) {
			user = scan.nextInt();
			if (computer > user)
				System.out.println("Guess higher");

			else if (computer < user)
				System.out.println("Guess lower");

		}
		System.out.println("You guessed right");

	}

}
