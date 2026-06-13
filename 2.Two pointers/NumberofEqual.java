import java.util.Scanner;

public class NumberofEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] a = new long[n];
        long[] b = new long[m];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextLong();
        }

        int i = 0, j = 0;
        long ans = 0;

        while (i < n && j < m) {

            if (a[i] < b[j]) {
                i++;
            }
            else if (a[i] > b[j]) {
                j++;
            }
            else {
                long value = a[i];

                long countA = 0;
                while (i < n && a[i] == value) {
                    countA++;
                    i++;
                }

                long countB = 0;
                while (j < m && b[j] == value) {
                    countB++;
                    j++;
                }

                ans += countA * countB;
            }
        }

        System.out.println(ans);

        sc.close();
    }
    
}
