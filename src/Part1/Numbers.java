package src.Part1;

/**
 * Task 1.2 Numbers operations.
 */
public class Numbers {
	public static void main(String[] args) {
		int     a = 2;
		int     b = 5;
		int     c = 3;
		double  D;

		System.out.printf("To show number operations let's solve this polynomial equation: %dx^2 + %dx + %d = 0\n", a, b, c);

		// here is Discriminant found using the formula
		D = Math.pow(b, 2) - (4 * a * c);
		System.out.printf("Discriminant is equal to: %.1f\n", D);

		if (D < 0) {
			System.err.println("The equation doesn't have real solutions.");
		} else if (D == 0) {
			double  x1 = (double) (-1 * b) / (2 * a);
			System.out.printf("There is only one solution, x = %.1f", x1);
		} else {
			double  x1 = ((-1 * b) + Math.abs(D)) / (2 * a);
			double  x2 = ((-1 * b) - Math.abs(D)) / (2 * a);
			System.out.printf("There are two real solutions:\n\tx1 = %.1f\n\tx2 = %.1f\n", x1, x2);
		}
	}
}
