package Step2;

import java.util.Scanner;

public class missingnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i =0 ; i<n ; i++){
            nums[i] = sc.nextInt();
            long low = 0;
        long high = nums.length;
        long ans = 0;

        while(low<=high){
            long mid = low + (high-low)/2;

            if(nums[mid] <= nums[i]){
                ans = mid+1;
                low = mid+1;

            }
            else{
                high = mid-1;
            }
        }
        
        }
    }
    
    
}
