import java.util.Scanner;

public class fibonacciTillN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the maximum number
        System.out.print("Enter the maximum number: ");
        int maxNumber = scanner.nextInt();

        System.out.print("Fibonacci series up to " + maxNumber + ": ");

        // Initialize the first two numbers of the series
        int a = 0, b = 1;

        // Print the first number
        System.out.print(a);

        // Generate and print the series
        while (b <= maxNumber) {
            System.out.print(" " + b);
            int c = a + b; // Calculate the next number
            a = b;           // Update 'a' to the next number
            b = c;        // Update 'b' to the new next number
        }

        scanner.close();
    }
}
