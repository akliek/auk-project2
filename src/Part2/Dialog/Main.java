package src.Part2.Dialog;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Hello, " + name + "! Welcome to Dialog.");

		System.out.print("Now I will try to guess the type of the sentence.\nPlease enter a random sentence: ");
		String s = scanner.nextLine();
		if (s.contains("!"))
			System.out.println("This is exclamative or imperative sentence.");
		else if (s.contains("?"))
			System.out.println("This is interrogative sentence.");
		else
			System.out.println("This is declarative or imperative sentence.");

		// Close the Scanner to avoid leaks
		scanner.close();
	}
}
