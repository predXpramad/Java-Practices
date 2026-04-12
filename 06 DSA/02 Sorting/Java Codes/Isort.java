// package 06 DSA.02 Sorting.Java Codes;
// 03 Insertion Sort


public class Isort {
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
        int[] result1 = insertionSort1(arr);
        System.out.println("Method 1 Result:");
        for(int num: result1){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static int[] insertionSort1(int[] nums)
    {
        int size = nums.length;
        for(int i =1; i<size; i++){
            int key = nums[i];
            int j = i-1;
            while(j>=0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        
        return nums;
    }
}
