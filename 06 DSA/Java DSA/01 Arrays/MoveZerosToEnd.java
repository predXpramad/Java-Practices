// package 01 Arrays;
// Problem 4: Move All Zeros to End (Easy/Medium)

// Task: Given an array, move all zeros to the end while keeping order of non‑zero elements. Do it in‑place.
// Example: [0,1,0,3,12] → [1,3,12,0,0]

// Solution (Two pointers – non‑zero pointer)

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        System.out.println(Arrays.toString(Move.zeros(arr)));
    }
}

class Move{
    public static int[] zeros(int [] arr){
        if(arr == null || arr.length == 0) throw new NullPointerException();

        int nonZeroPos = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[nonZeroPos++] = arr[i];
            }
        }
        while(nonZeroPos < arr.length){
            arr[nonZeroPos++] = 0;
        }

        return arr;
    }
}
