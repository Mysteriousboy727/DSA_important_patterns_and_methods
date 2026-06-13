import java.util.Scanner;

public class closettoright {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k= sc.nextInt();

    int[] a = new int[n];
        for(int i = 0; i<n ; i++){
            a[i] = sc.nextInt();
        }

    for(int i = 0 ; i<k; i++){
        int key = sc.nextInt();

        int low = 0;
        int high = n-1;
        int ans = 0;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(a[mid] >= key){
                ans = mid+1;
                high = mid+1;
            }
            else{
                low = mid-1;
            }
        }
        System.out.println(ans);
    }
    }
}
