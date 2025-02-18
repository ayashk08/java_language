// Java Program to Swap Two values using third variable
// using temp variable 

public class swap4 {

    
    static void swapValuesUsingThirdVariable(int m, int n)
    {
        int temp = m;
        m = n;
        n = temp;
        System.out.println("Value of m is " + m  + " and Value of n is " + n);
    }

    public static void main(String[] args)
    {
        int m = 9, n = 5;
        swapValuesUsingThirdVariable(m, n);
    }
}
