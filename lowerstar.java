// Java program to print Mirror Lower Star Triangle Pattern
public class lowerstar {
	public static void main(String[] args)
	{
		
		int number = 7;
		int m, n;
		for (m = 1; m <= number; m++) {
			for (n = 1; n < m; n++) {
				
				System.out.print(" ");
			}
			for (n = m; n <= number; n++) {
				System.out.print("*"
								+ " ");
			}

			
			System.out.println();
		}

		for (m = number - 1; m >= 0; m--) {

			
			for (n = 0; n < m; n++) {
			
				System.out.print(" ");
			}

			for (n = m; n <= number - 1; n++) {
				
				System.out.print("*"
								+ " ");
			}

			
			System.out.println();
		}
	}
}

