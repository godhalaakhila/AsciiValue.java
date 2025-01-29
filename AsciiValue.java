import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a character
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        // Display the ASCII value of the entered character
        int asciiValue = (int) character;
        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);

        // Close the scanner
        scanner.close();
    }
}
 
    

