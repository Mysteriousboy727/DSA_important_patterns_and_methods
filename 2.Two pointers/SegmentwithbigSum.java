import java.util.Scanner;

public class SegmentwithbigSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long s = sc.nextLong();

        long[] a = new long[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }

        int L = 0;
        long sum = 0;

        int ans = Integer.MAX_VALUE;

        for(int R = 0; R < n; R++){

            sum += a[R];

            while(sum >= s){

                ans = Math.min(ans, R - L + 1);

                sum -= a[L];
                L++;
            }
        }

        if(ans == Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else{
            System.out.println(ans);
        }
    }
}