package src.Part1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Task 1.4 Input/Output operations.
 */
public class IO {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Hello, " + name + "! Welcome to Input/Output Demo.");

		System.out.print("Please enter you age: ");
		try {
			int age = scanner.nextInt();
			System.out.println("You are " + age + " years old.");
		} catch (InputMismatchException e) {
			System.err.println("\u001B[31mOnly integer numbers are allowed.\u001B[0m");
		}

		// Close the Scanner to avoid leaks
		scanner.close();
	}
}
