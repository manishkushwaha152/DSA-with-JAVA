import java.util.Scanner;

public class Armstrong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input range
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {
            int originalNum = num;
            int temp = num;
            int count = 0;

            // Count digits
            while (temp > 0) {
                count++;
                temp /= 10;
            }

            temp = num;
            int sum = 0;

            // Calculate digit^count sum
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, count);
                temp /= 10;
            }

            // Check if Armstrong
            if (sum == originalNum) {
                System.out.print(originalNum + " ");
            }
        }
        
       System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        
    }
}

    
