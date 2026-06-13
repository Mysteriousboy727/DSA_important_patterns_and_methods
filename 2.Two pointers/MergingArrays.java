import java.util.Scanner;

public class MergingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        // Read first array
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Read second array
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int i = 0, j = 0;

        // Merge both arrays
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else {
                System.out.print(b[j] + " ");
                j++;
            }
        }

        // Print remaining elements of first array
        while (i < n) {
            System.out.print(a[i] + " ");
            i++;
        }

        // Print remaining elements of second array
        while (j < m) {
            System.out.print(b[j] + " ");
            j++;
        }

        sc.close();
    }
}

//Two pointer approach code:
/*while(left <right){
    if(current_sum == target){
        return {left , right};
    }
    else if(current_sum < target){
        left++;
    }
    else{
        right--;
    }
}*/
