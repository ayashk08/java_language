// Java Program to Print Upper Star Triangle Pattern
public class upperstar{

		public static void main(String[] args)
	{
		int k = 9;
		for (int a = 0; a <= k; a++) {

			for (int b = 1; b <= k - a; b++) {


				System.out.print(" ");
			}
			for (int l = 0; l <= a; l++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

