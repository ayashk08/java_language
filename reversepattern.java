// Java program to Print Reverse Pyramid Star Pattern
// Using While loop

public class reversepattern {
	public static void main(String[] args)
	{
		int number = 7;

		int i = number, j;
		while (i > 0) {
			j = 0;

			while (j++ < number - i) {
				System.out.print(" ");
			}

			j = 0;
			while (j++ < (i * 2) - 1) {
				System.out.print("*");
			}

			System.out.println();
			i--;
		}
	}
}

