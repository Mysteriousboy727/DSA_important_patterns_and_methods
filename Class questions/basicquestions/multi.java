import java.util.Scanner;

public class multi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mul = 1;

        n = Math.abs(n); 

        while (n != 0) {
            int digit = n % 10;
            mul *= digit;
            n /= 10;
        }

        System.out.println(mul);
    }
}