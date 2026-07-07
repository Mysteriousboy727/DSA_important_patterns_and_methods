import java.util.Scanner;
public class minimumdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int smallest = 1;
        while(n !=0){
            n = n%10;
            if (n <smallest){
                smallest = n;
                
        }
        n = n/10;
        
    }
    System.out.println(smallest);
}
}
    


