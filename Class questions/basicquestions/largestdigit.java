import java.util.Scanner;
public class largestdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int largest = 0;
        while(n !=0){
            n = n%10;
            if (n> largest){
                largest = n;
                n = n/10;

            }
            
        }
        System.out.println(largest);
    }
    
}
