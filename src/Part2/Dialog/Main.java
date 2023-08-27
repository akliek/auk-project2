package src.Part2.Dialog;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Part 2 dialog.
 */
public class Main {
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

		System.out.println("Now I will try to guess the type of the sentence.");
		for (int i = 0; i < 8; i++)
		{
			System.out.print("Please enter a random sentence: ");
			String s = scanner.nextLine();
			if (s.contains("!"))
				System.out.println("This is exclamative or imperative sentence.");
			else if (s.contains("?"))
				System.out.println("This is interrogative sentence.");
			else
				System.out.println("This is declarative or imperative sentence.");
		}

		// Close the Scanner to avoid leaks
		scanner.close();
	}
}
