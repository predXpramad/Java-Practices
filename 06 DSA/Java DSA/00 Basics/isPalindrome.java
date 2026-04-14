// package 00 Basics;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversed = "";

        for(int i = str.length() -1; i>=0 ;i--){
            reversed += str.charAt(i);
        }

        if(reversed.equals(str))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
    }
}
