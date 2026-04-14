// Problem 1: Find the Maximum Element (Easy)

// Task: Given an array of integers, return the maximum value.
// Example: [3, 7, 2, 9, 1] → 9

public class MaxElement{
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 1};
        int result = MaxElem.FindMax(arr);
        System.out.println(result);

    }
}

class MaxElem{
    int[] arr;
    public static int FindMax(int[] arr){
        if(arr == null || arr.length == 0) throw new IllegalArgumentException("Array Empty");
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            
        }
        return max;

    }
}