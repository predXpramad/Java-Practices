// package 01 Arrays;
// Problem 2: Reverse an Array In‑place (Easy)

// Task: Reverse the order of elements. Do not use extra array.
// Example: [1,2,3,4,5] → [5,4,3,2,1]

import java.util.Arrays;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] result = ReverseArray.RevArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}


class ReverseArray{
    public static int[] RevArray(int[] arr){
        if(arr == null|| arr.length ==0){
            return arr;
        }
        int left = 0, right = arr.length-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right--;
        }
        return arr;
    }
}