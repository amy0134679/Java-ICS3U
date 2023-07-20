import java.util.Scanner;

public class PiApproximation {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = 0;
		
		System.out.println("Please enter your guess:");
		guess = keyboard.nextDouble();
		
		root:
		while (true) {
			fX = 6 * Math.pow(guess, 4) - 13 * Math.pow(guess, 3) - 18 * guess * guess + 7 * guess + 6;
			dX = 24 * Math.pow(guess, 3) - 39 * guess * guess - 36 * guess + 7;
		
			newGuess = guess - fX / dX;
			System.out.println("New guess is: " + newGuess);
			
			if (Math.abs(guess - newGuess) <= 0.000001) {
				break root;
			}
			
			guess = newGuess;
		}
		System.out.println("=================================");
		System.out.println("The root is: " + Math.round(newGuess));
	}
}

