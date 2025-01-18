import java.util.Scanner;

public class OddEvenCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize counters for odd and even numbers
        int oddCount = 0;
        int evenCount = 0;

        System.out.println("Enter numbers to check (type -1 to stop):");

        while (true) {
            // Accept a number from the user
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Check if the user wants to stop
            if (number == -1) {
                break;
            }

            // Check if the number is even or odd
            if (number % 2 == 0) {
                evenCount++; // Increment even counter
            } else {
                oddCount++; // Increment odd counter
            }
        }

        // Display the counts
        System.out.println("\nSummary:");
        System.out.println("Total odd numbers: " + oddCount);
        System.out.println("Total even numbers: " + evenCount);

        scanner.close();
    }
}
