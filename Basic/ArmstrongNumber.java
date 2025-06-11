import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int count = 0;
        int temp = num;

        // Step 1: Count the number of digits
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int sum = 0;
        temp = num;

        // Step 2: Calculate sum of digits raised to the power of 'count'
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }

        // Step 3: Check if Armstrong
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number.");
        }

       
    }
}
