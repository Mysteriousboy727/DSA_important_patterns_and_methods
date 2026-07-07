import java.util.Scanner;

public class squares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int square =0;
    int digit =0;
    while( n != 0){
        digit = n%10;
        square = square + digit*digit;
        n = n/10;
        
    }
    System.out.println(square);
    
    }
    
}
