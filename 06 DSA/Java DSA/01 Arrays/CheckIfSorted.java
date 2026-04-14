// package 01 Arrays;
// Problem 3: Check if Array is Sorted (Easy)

// Task: Return true if array is non‑decreasing (each element ≤ next).
// Example: [1,2,2,3] → true; [1,3,2] → false

public class CheckIfSorted {
    public static void main(String[] args) {
        int [] arr1 = {1,2,2,3};
        int [] arr2 = {1,3,2};
        System.out.println(check.Sorted(arr1));
        System.out.println(check.Sorted(arr2));
    }
}

class check{
    public static boolean Sorted(int [] arr){
        if(arr == null || arr.length == 0) throw new NullPointerException();

        for(int i =0; i < arr.length-1; i++){
            if (arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}