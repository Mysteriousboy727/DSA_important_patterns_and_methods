import java.util.*;

public class fastsearch {

    static int lowerBound(int[] a, int target){

        int low = 0;
        int high = a.length;

        while(low < high){

            int mid = low + (high - low)/2;

            if(a[mid] >= target){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }

    static int upperBound(int[] a, int target){

        int low = 0;
        int high = a.length;

        while(low < high){

            int mid = low + (high - low)/2;

            if(a[mid] > target){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int k = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<k;i++){

            int l = sc.nextInt();
            int r = sc.nextInt();

            int left = lowerBound(a,l);

            int right = upperBound(a,r);

            sb.append(right-left).append(" ");
        }

        System.out.println(sb);

        sc.close();
    }
}