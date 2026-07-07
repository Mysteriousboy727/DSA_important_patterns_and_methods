import java.util.Scanner;

public class atmcashwith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //500 , 200 , 100 , 50 , 20 , 10 , 5 , 2 , 1
        int n = sc.nextInt();
        int[] notes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        if(n <100 || n%100 != 0){
            System.out.println("Invalid amount");
            return;
        }
        int[] count = new int[notes.length];
        int total = 0;
        for(int i = 0; i<notes.length;i++){
            count[i] = n/notes[i];
            total += count[i];
            n = n%notes[i];
            if(n == 0){
                break;
            }
        }
        System.out.println("Total notes required: " + total);
        System.out.println("Notes breakdown:");
        for(int i = 0; i<notes.length;i++){
            if(count[i] > 0){
                System.out.println(notes[i] + ": " + count[i]);
            }
        }
    }
    
}
