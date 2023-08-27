package src.Part2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Task 2 dialog.
 */
public class Dialog {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Hello, " + name + "! Welcome to Dialog.");

		System.out.print("Please enter your age: ");
		try {
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.println("You are " + age + " years old.");
		} catch (InputMismatchException e) {
			System.err.println("\u001B[31mAge is a number.\u001B[0m");
		}

		System.out.print("What is result of 1 / 2?. Please enter the answer: ");
		try {
			double res = scanner.nextDouble();
			scanner.nextLine();
			if (res != 0.5)
				System.out.println("\u001B[31mWrong!\u001B[0m");
			else
				System.out.println("\u001B[32mCorrect!\u001B[0m");
		} catch (InputMismatchException e) {
			System.err.println("\u001B[31mWrong!\u001B[0m");
		}

		System.out.print("Is 2 + 2 equal 4?. true or false?: ");
		try {
			boolean res = scanner.nextBoolean();
			scanner.nextLine();
			if (!res)
				System.out.println("\u001B[31mWrong!\u001B[0m");
			else
				System.out.println("\u001B[32mCorrect!\u001B[0m");
		} catch (InputMismatchException e) {
			System.err.println("\u001B[31mWrong!\u001B[0m");
		}

		System.out.println("Now I will try to guess the type of the sentence.");
		for (int i = 0; i < 6; i++)
		{
			System.out.print("Please enter a random sentence: ");
			String s = scanner.nextLine();
			if (s.contains("!"))
				System.out.println("\u001B[32mThis is exclamative or imperative sentence.\u001B[0m");
			else if (s.contains("?"))
				System.out.println("\u001B[32mThis is interrogative sentence.\u001B[0m");
			else
				System.out.println("\u001B[32mThis is declarative or imperative sentence.\u001B[0m");
		}

		// Close the Scanner to avoid leaks
		scanner.close();
	}
}
