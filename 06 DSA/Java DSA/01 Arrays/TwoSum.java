// package 01 Arrays;
// Problem 5: Two Sum (Easy, but classic)

// Task: Return indices of two numbers that add up to a target. Assume exactly one solution.
// Example: nums = [2,7,11,15], target = 9 → [0,1]

// Solution (HashMap – O(n) time)

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(Solution.twoSum(arr, target)));
    }
}

class Solution{
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
                
        }
        
        
        return new int[]{};
    }
}