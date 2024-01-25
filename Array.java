import java.util.Scanner;
import java.util.Arrays;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept size from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Accept numbers from the user
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Find the greatest and smallest numbers
        int greatest = numbers[0];
        int smallest = numbers[0];

        for (int i = 1; i < size; i++) {
            if (numbers[i] > greatest) {
                greatest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        // Sort the array in ascending order
        int[] ascendingOrder = Arrays.copyOf(numbers, size);
        Arrays.sort(ascendingOrder);

        // Sort the array in descending order
        int[] descendingOrder = Arrays.copyOf(numbers, size);
        Arrays.sort(descendingOrder);
        for (int i = 0, j = size - 1; i < j; i++, j--) {
            int temp = descendingOrder[i];
            descendingOrder[i] = descendingOrder[j];
            descendingOrder[j] = temp;
        }

        // Display results
        System.out.println("Greatest Number: " + greatest);
        System.out.println("Smallest Number: " + smallest);
        System.out.println("Ascending Order: " + Arrays.toString(ascendingOrder));
        System.out.println("Descending Order: " + Arrays.toString(descendingOrder));

        scanner.close();
    }
  }
