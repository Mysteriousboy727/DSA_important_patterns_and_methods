import java.util.Scanner;
public class integertoroman{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] values = {5000 , 10000 ,50000 ,100000,500000,1000000,1000 , 900 , 500 , 400 , 100 , 90 , 50 , 40 , 10 , 9 , 5 , 4 , 1};
        String[] symbols = {"(V)","(X)","(L)", "(C)", "(D)", "(M)", "M" , "CM" , "D" , "CD" , "C" , "XC" , "L" , "XL" , "X" , "IX" , "V" , "IV" , "I"};
        StringBuilder roman = new StringBuilder();
        for(int i = 0; i<values.length ; i++){
            while(num >= values[i]){
                roman.append(symbols[i]);
             
                num -= values[i];
            }
        }
        System.out.println(roman.toString());

    }
}