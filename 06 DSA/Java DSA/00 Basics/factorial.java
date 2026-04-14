// package 00 Basics;

import java.util.Scanner;

public class factorial {
    public static int fact(int num){
        int factorail = 1;
        for( int i = 1; i<=num; i++){
            factorail *=i;
        }
        return factorail;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Number" );
            int num = sc.nextInt();
            int res = fact(num);
            System.out.println(res);
        }
    }
}


// class Fact{
//     public static int factorail(int num){
//         int result = 0;
//         if(num == 0 || num ==1)
//             return 1;
//         for(int i = num; i>0; i--){
//             result = factorail(num)*factorail(num-i);
//         }
//         return result;
        
//     }
// }