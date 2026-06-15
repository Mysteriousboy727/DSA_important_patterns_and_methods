import java.util.Scanner;

public class ropes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] ropes = new int[n];
        int max = 0;

        for(int i =0 ; i<n ; i++){
             ropes[i] = sc.nextInt();
             max = Math.max(max , a[i]);
        }
        double low = 0.0;
        double high = max;

        for(int i = 0; i<100 ; i++){
            double mid = low +(high-low)/2;
            int pieces = 0;
            for(int rope : ropes){
                pieces = pieces + (int)(rope/mid);
            }
            if(pieces >=m){
                low = mid;
            }else{
                high = mid;
            }
        }
                System.out.printf("%.10f\n", low);

    }
}