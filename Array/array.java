package Array;

import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask the user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Step 2: Create an array of that size
        int[] numbers = new int[n];

        // Step 3: Input elements into the array
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
          
            numbers[i] = scanner.nextInt();
        }

        // Step 4: Print the array elements
        System.out.println("The array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        scanner.close();
    }
}

