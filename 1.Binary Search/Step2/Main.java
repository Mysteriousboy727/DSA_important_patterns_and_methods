import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();

        if (n == 1) {
            System.out.println(Math.min(x, y));
            return;
        }

        long first = Math.min(x, y);

        long low = 0;
        long high = n * first;
        long ans = high;

        while (low <= high) {

            long mid = low + (high - low) / 2;

            long copies =
                    1 +
                    (mid - first >= 0 ? (mid - first) / x : 0) +
                    (mid - first >= 0 ? (mid - first) / y : 0);

            if (copies >= n) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(ans);
    }
}