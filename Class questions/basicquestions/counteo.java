import java.util.Scanner;

public class counteo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

        int even = 0;
        int c =0;
        int odd = 0;
        int d = 0;

        while (n != 0) {
            int digit = n % 10;

            if (digit % 2 == 0) {
                c = c+1;

                even += digit;
            } else {
                d = d+1;
                odd += digit;
            }

            n /= 10;
        }

        System.out.println("number of even digits = " + c);
        System.out.println("number of odd digits = " + d);
    }
    
}
