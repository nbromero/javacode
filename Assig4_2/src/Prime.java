import java.util.Scanner;

public class Prime {

	public static void main(String args[]) {

		System.out
				.println("Enter a number. The system will find the prime numbers smaller than this number: ");
		int userInput = new Scanner(System.in).nextInt();

		System.out.println("These are the prime numbers smaller than " + userInput +":");

		for (int biggestNumber = 2; biggestNumber <= userInput; biggestNumber++) {

			if (isPrime(biggestNumber)) {
				System.out.println(biggestNumber);
			}
		}
	}

	public static boolean isPrime(int value) {
		for (int n = 2; n < value; n++) {
			if (value % n == 0) {
				return false;
			}
		}
		return true;
	}
}
