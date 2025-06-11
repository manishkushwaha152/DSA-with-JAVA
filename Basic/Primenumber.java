import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take range input
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        for (int num = start; num <= end; num++) {
            if (num < 2) {
                continue; // Skip numbers less than 2
            }

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }

       
    }
}
