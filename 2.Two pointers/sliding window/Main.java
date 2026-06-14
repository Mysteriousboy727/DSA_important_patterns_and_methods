import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long s = sc.nextLong();

        long[] a = new long[n];

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        int left = 0;
        long sum = 0;
        int ans = 0;

        for(int right = 0; right < n; right++) {

            sum += a[right];

            while(sum > s) {
                sum -= a[left];
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        System.out.println(ans);

        sc.close();
    }
}
