// Java Program to Print Square Pattern

public class squarestar {

	
	static void print_rectangle(int k, int l)
	{
		int a, b;
		for (a = 1; a <= k; a++) {
			for (b = 1; b <= l; b++) {
				if (a == 1 || a == k || b == 1 || b == l)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

	public static void main(String args[])
	{

		int rows = 8, columns = 22;


		print_rectangle(rows, columns);
	}
}

