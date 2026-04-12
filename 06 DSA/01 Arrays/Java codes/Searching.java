// package 06 DSA.01 Arrays.Java codes;
// 2

// Binary search through recursion
public class Searching {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
        int target = 10;
        int result = binarySearch(arr, target, 0, arr.length);
        System.out.println("The position of element " + target +" is : " + result);
    }

    public static int binarySearch(int[] nums, int target, int left, int right){
        // int left = 0, right = n-1;
        
        if(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                return binarySearch(nums, target, mid + 1 , right);
            else
                return binarySearch(nums, target, left, mid-1);
        }
        return -1;
        
    }
}
