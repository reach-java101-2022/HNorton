package murach.games;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		System.out.println("Welcome to the Number Guessing Game");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter upper limit for guess: ");
		int upperLimit = Integer.parseInt(sc.nextLine());
		NumberGame game = new NumberGame(upperLimit);
		System.out.println();

		System.out.print("Enter your guess: ");
		int guess = Integer.parseInt(sc.nextLine());
		while (guess != game.getNumber()) {
			if (guess < game.getNumber()) {
				System.out.println("Your guess is too low.\n");
			} else if (guess > game.getNumber()) {
				System.out.println("Your guess is too high.\n");
			}
			game.incrementGuessCount();
			System.out.print("Enter your guess: ");
			Integer.parseInt(sc.nextLine());

			System.out.println("Correct!\n");
			System.out.println("You guessed the correct number in " + game.getGuessCount() + " guesses.\n");
			System.out.println("Bye!");
			System.out.println("Do you wish to replay? y/n");
			
			if y (sc.loop());
			int upperlimit = y (sc.loop());
			
			if n (sc.close());
			int upperlimit = n (sc.close());
		}
	}
}