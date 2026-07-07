import java.util.Scanner;

public class sumofdivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int divisor = 0;
        for(int i = 1 ; i<n ; i++){
            if(n%i ==0)
                divisor = divisor+i;
            
        }
        System.out.println(divisor);
    }
    
}
