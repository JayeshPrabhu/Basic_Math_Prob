import java.util.Scanner;

public class Reverse_Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter an integer to reverse: ");
        int n = scanner.nextInt();

        // Handle negative numbers
        boolean isNegative = n < 0;
        n = Math.abs(n);  // Make it positive for processing

        int revNum = 0;

        while (n > 0) {
            int ld = n % 10; // Last digit
            revNum = (revNum * 10) + ld; // Append last digit to reverse
            n = n / 10; // Remove last digit
        }

        if (isNegative) {
            revNum *= -1; // Restore negative sign
        }

        System.out.println("Reversed Number: " + revNum);
    }
}
