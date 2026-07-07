import java.util.Scanner;

public class reversethearray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = 0;

        int reverse = 0;
        int n = sc.nextInt();
        while(n != 0){
             c = c+1;
            int digit = n%10;
           reverse = reverse*10 + digit;
            n = n/10;
           
        }
        System.out.println(reverse);
        System.out.print(c);
    
        }
}