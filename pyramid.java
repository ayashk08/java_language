
// Java code to demonstrate Pyramid star patterns
public class pyramid {
	public static void PyramidStar(int n)
	{
		int a, b;
		for (a = 0; a < n; a++) {
			for (b = 0; b <= a; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int k = 5;
		PyramidStar(k);
	}
}

