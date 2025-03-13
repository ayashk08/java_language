import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking a character input
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0); // Read the first character

        // Convert the character to lowercase for easy comparison
        ch = Character.toLowerCase(ch);

        // Switch case to check whether the character is a vowel or consonant
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                // If it's not a vowel, it must be a consonant (assuming it's an alphabet)
                if ((ch >= 'a' && ch <= 'z')) {
                    System.out.println(ch + " is a consonant.");
                }
                // If it's not an alphabet, it's neither a vowel nor a consonant
                else {
                    System.out.println(ch + " is not an alphabet.");
                }    
            
        }

    }

}