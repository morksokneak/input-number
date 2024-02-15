import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (enter -1 to stop):");

        // Create an initial capacity for the array
        int initialCapacity = 10;
        int[] numbers = new int[initialCapacity];
        int count = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int input = scanner.nextInt();

            if (input == -1) {
                // Stop if -1 is entered
                break;
            }

            // Check if the array needs to be resized
            if (count == numbers.length) {
                int newCapacity = numbers.length * 2;
                int[] newArray = new int[newCapacity];
                System.arraycopy(numbers, 0, newArray, 0, numbers.length);
                numbers = newArray;
            }

            // Store the entered number
            numbers[count] = input;
            count++;
        }

        // Display the entered numbers
        System.out.println("\nEntered numbers:");
        for (int i = 0; i < count; i++) {
            System.out.println(numbers[i]);
        }

        // Close the scanner
        scanner.close();
    }
}