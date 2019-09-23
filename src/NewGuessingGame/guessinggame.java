package NewGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class guessinggame {

	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {

		int answer, guess;
		final int Max = 10;
		boolean correct = false;
		int userGuess = 0;
		int numberOfGuessesLeft = 3;

		Random rand = new Random();

		answer = rand.nextInt(Max) + 1;

		while (!correct && userGuess < numberOfGuessesLeft) {

			System.out.println("Guess a number between 1 and 10.");
			guess = keyboard.nextInt();

			if (guess == answer) {
				correct = true;
				System.out.println("Good job, you win!  You get a cookie!");
			} else if (guess < answer && guess > 0) {
				System.out.println("Guess Higher");
				userGuess++;
			} else if (guess > answer) {
				System.out.println("Guess is lower");
				userGuess++;
			} else if (guess == 0) {
				System.out.println("You didn't guess a number between 1 and 10, please try again.");
			} else if (guess == -1) {
				System.exit(1);
			}
		}  if (userGuess == numberOfGuessesLeft) {
			System.out.println("You lose, you didn't guess the right number!");
		}
	}

}
