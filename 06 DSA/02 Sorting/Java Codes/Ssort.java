// package 06 DSA.02 Sorting.Java Codes;
// 02 Selection sort is better compare to bubble sort
// Time Complexity is O(n^2), but better in terms of swapping


public class Ssort {
    public static void main(String[] args) {
        int[] arr = {8,5,7,4,6,1};
        // Before Sorting
        System.out.println("Before Sorting");
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();        
        
        //Method 1
        System.out.println("Method 1");
        int[] result1 = selectionSort1(arr);
        System.out.println("Method 1 Result:");
        for(int num: result1){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();
        
        //Method 2
        System.out.println("Method 2");
        int[] result2 = selectionSort2(arr);
        System.out.println("Method 2 Result:");
        for(int num: result2){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // I Tried in my own way
    public static int[] selectionSort1(int[] nums){
        int size = nums.length;
        int temp = 0;

        for(int i = 0; i<size;i++){
            int max = 0;
            for(int j=0;j<size-i;j++){
                if(nums[max] < nums[j])
                {
                    max = j;
                }
                if(nums[j]==nums[size-1-i]){
                    temp = nums[max];
                    nums[max] = nums[j];
                    nums[j] = temp;
                }
            }
            for(int num: nums){
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        return nums;
    }


    // Actual Method Mentioned
    public static int[] selectionSort2(int[] nums)
    {
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;

        for(int i = 0; i<size-1; i++)
        {
            minIndex = i;
            for(int j = i+1; j<size; j++)
            {
                if(nums[minIndex] > nums[j])
                {
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            for(int num: nums){
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        
        return nums;
    }
}
