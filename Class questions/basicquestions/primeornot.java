import java.util.Scanner;
public class primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //prime 2 , 3 , 5 , 7 , 9

        boolean prime = true;
        for(int i = 2 ; i<n ; i++){
            if(n%i == 0){
                prime = false;
                break;
            }
        }
        if(prime)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
   
        
    
}
