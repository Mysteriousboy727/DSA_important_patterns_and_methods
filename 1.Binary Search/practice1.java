import java.util.Scanner;
public class practice1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();

    
        int[] a = new int[n];
        for(int i = 0; i<n ; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i = 0 ; i<k ; i++){
            int key = sc.nextInt();

            int low = 0;
            int high = n-1;
            boolean found = false;
             while(low<=high){
                int mid = low + (high-low)/2;
            if(a[mid] == key){
                found = true;
                break;
    }
            else if(key<a[mid])
    {
            high = mid -1;
    }
    else{
        low = mid+1;
    }
}
if(found){
    System.out.println("YES");
}
else{
    System.out.println("NO");
}

        }
        
       
    }

        
    }



//binary search alogorith code:
/*while(low<=high){
    mid = (low+high)/2;
    if(key == a(mid)){
        return mid
    }
    else if(key<a(mid))
    {
        h = mid-l;
        l=l;
    }
    else{
        l = mid+l;
        h = h;
    }
}*/