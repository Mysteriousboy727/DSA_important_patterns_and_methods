import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        num = Math.abs(num); // Handles negative numbers

        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}