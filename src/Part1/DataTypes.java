package src.Part1;

/**
 * Task 1.1 data types.
 */
public class DataTypes {
    public static void main(String[] args) {
        int     n = 5;
        double  num = 1.1;
        char    c = 'C';
        boolean ok = false;
        String  str = "\tint\n\tdouble\n\tchar\n\tboolean\n\tstring";

        System.out.printf("I'm testing %d data types\n", n);
        System.out.printf("Here is the list of them: \n%s\n", str);
	    System.out.printf("It is task number %.1f\n", num);
	    System.out.printf("My first programming language is %c\n", c);
	    System.out.printf("Statement, that Earth is flat - %b\n", ok);
    }
}
