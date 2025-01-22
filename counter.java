import java.util.Scanner;
public class OddEvenCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddCount = 0;
        int evenCount = 0;
        System.out.println("Enter numbers to check (type -1 to stop):");
        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            if (number % 2 == 0) //even check {
                evenCount++; //increment even count
            } else {
                oddCount++; //increment odd count
            }
        }
        System.out.println("Total odd numbers: " + oddCount);
        System.out.println("Total even numbers: " + evenCount);
        scanner.close();
    }
}
