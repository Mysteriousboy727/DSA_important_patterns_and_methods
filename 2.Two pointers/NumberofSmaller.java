
import java.util.Scanner;



public class NumberofSmaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        

        for(int i = 0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i<m ;i++){
            int b = sc.nextInt();
            int low = 0;
            int high = n-1;
            int ans = 0;


while(low <= high){
    int mid = low + (high-low)/2;

    if(a[mid] < b){
        ans = mid + 1;      // 1-based index
        low = mid + 1;      // search further right
    }
    else{
        high = mid - 1;
    }
}

System.out.println(ans);
        
        }
         
    }
    
}
