package src.Part1.StringOperations;

/**
 * Part 1.3 String operations.
 */
public class Main {
	public static void main(String[] args) {
		// sample string
		String  s = "string to play around with";

		System.out.printf("To show string operations I'm going to use this string as an example: \"%s\"\n", s);

		System.out.printf("Let's transform this string to upper case. The result is: \"%s\"\n", s.toUpperCase());

		System.out.printf("Let's delete all whitespaces from the string. The result is: \"%s\"\n", s.replace(" ", ""));

		System.out.printf("Let's add another string to this one. The result is: \"%s\"\n", s + ". Another string");

		System.out.println("The length of this string is - " + s.length());

		System.out.println("The statement, that this string is empty - " + s.isEmpty());
	}
}
