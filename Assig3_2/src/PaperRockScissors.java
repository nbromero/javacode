import java.util.Scanner;
import java.util.Random;

public class PaperRockScissors {
	public static void main(String[] args) {
		int user;

		int computer;

		int scissors = 0;
		int rock = 1;
		int paper = 2;

		Random generator = new Random();
		computer = generator.nextInt(3);
		if (computer == 0)
			computer = scissors;
		else if (computer == 1)
			computer = rock;
		else if (computer == 2)
			computer = paper;

		System.out.println("scissors (0), rock (1), paper (2):");
		Scanner scan = new Scanner(System.in);
		user = scan.nextInt();

		if (computer == user)
			System.out.println("It's a tie.");
		
		
		if (user == 1)
			if (computer == 0)
				System.out.println("You won: Rock beats Scissors");
			else if (computer == 2)
				System.out.println("You lost: Paper beats Rock");

		if (user == 2)
				if (computer == 0)
					System.out.println("You lost: Scissor beats Paper");
				else if (computer == 1)
					System.out.println("You won: Paper beats Rock");

		if (user == 0)
					if (computer == 2)
						System.out.println("You won: Scissor beats Paper");
					else if (computer == 1)
						System.out.println("You lost: Rock beats Scissor");
	}

}
