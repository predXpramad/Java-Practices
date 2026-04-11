import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class collsort {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(100);
        nums.add(55);
        nums.add(2);
        nums.add(10);

        for(int num: nums){
            System.out.println(num);
        }
            
        Collections.sort(nums);

        for(int num: nums){
            System.out.println(num);
        }
    }
}
