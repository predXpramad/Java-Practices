// package 06 DSA.Arrays;
// 01 
// Abstract Data Type is nothing but Data and it's associated operation. Like for 
// 'int' data type we can perform add/sub/div/mult etc operations. We can create 
// custom data type, where we can perform our own custom operation. The class 
// itself is an complex data Type.


public class AbstractDataTypes {
    public static int linearSearch(int[] arr, int target){
        if (arr == null || arr.length ==0)
            return -1;
        int steps1 = 0;
        for(int i = 0; i<arr.length;i++){
            steps1++;
            if(arr[i] == target ){
                System.err.println("Steps taken by LS: " + steps1);
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target){
        if (arr == null || arr.length ==0)
            return -1;
        int n = arr.length;
        int left = 0, right = n -1;
        
        int steps = 0;
        while(left<=right){
            steps++;
            int mid = (left + right)/2;
            if(arr[mid]==target){
                System.err.println("Steps taken by BS: " + steps);
                return mid;
            }
            else if(arr[mid]<target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] arr = new int[10]; // integer Array of Size 10
        // or Directly assign values
        int[] arr1 = {10,20,30,40,50};
        
        int target = 50;
        
        // Linear search
        
        var LS = linearSearch(arr1,target);
        if(LS != -1)
            System.out.println("Position of element " +  target + " is : " +LS);
        else
            System.out.println("Element not Found");


        // Binary Search
        
        var BS = binarySearch(arr1,target);
        if(BS != -1)
            System.out.println("Position of element " +  target + " is : " +BS);
        else
            System.out.println("Element not Found");
    }
}
