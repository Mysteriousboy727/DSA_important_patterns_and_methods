
import java.util.Scanner;

public class sumofnosinrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        long sum = 0;

        for(int i = x ; i<=y ; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
    
}
