import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //armstrong number


        int n = sc.nextInt();
        int temp = n;

        int length = String.valueOf(Math.abs(n)).length(); 

        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum += (int) Math.pow(digit, length);

            n = n/10;

        }
        if(temp == sum)
            System.out.println("Armstrong number");
        else
            System.out.println("Not armstrong");
    }
}