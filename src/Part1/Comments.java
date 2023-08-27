package src.Part1;

/**
 * Task 1.5 comments.
 * This class is created to demonstrate different comments types.
 * This Javadoc comment.
 */
public class Comments {
	/**
	 * This method returns integer it gets.
	 * @param n - random integer
	 * @return integer, that in gets
	 */
	private static int getNumber(int n) {
		return n;
	}

	public static void main(String[] args) {
		// This is single line comment. Here we initialize an integer.
		int n = 5;

		/*
		This is multi-line comment.
		Here I will print output of getNumber method.
		 */
		System.out.println("Here is the result of the getNumber method: " + getNumber(n));
	}
}
