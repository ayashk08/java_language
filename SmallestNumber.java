import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking input for three numbers
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number:");
        int num3 = sc.nextInt();

        // Nested if-else to find the smallest number
        if (num1 <= num2) {
            if (num1 <= num3) {
                System.out.println("The smallest number is: " + num1);
            } else {
                System.out.println("The smallest number is: " + num3);
            }
        } else {
            if (num2 <= num3) {
                System.out.println("The smallest number is: " + num2);
            } else {
                System.out.println("The smallest number is: " + num3);
            }
        }

        sc.close();
    }
}

