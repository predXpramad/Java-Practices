// package 06 DSA.02 Sorting.Java Codes;
// 01 Bubble sort - Not efficient

public class Bsort {
    public static void main(String[] args) {
        int[] nums = {4,3,6,2,8,1};
        System.out.println("Before Sorting:");
        for(int n:nums){
            System.out.print(n + " ");
        }
        System.out.println();
        
        int[] result = bubbleSort(nums);
        System.out.println("After Sorting:");
        for(int n: result){
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static int[] bubbleSort(int[] nums) {
        
        int n = nums.length;
        int temp = 0;
        for(int i = 0; i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(nums[j] > nums[j+1])
                {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }           
            }
            
            for(int num: nums){
                System.out.print(num + " ");
            }
            System.out.println();
        }

        return nums;
        
    }    
}
