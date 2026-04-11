import java.util.HashSet;
import java.util.Set;

public class sets{
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(2);
        for(Integer s: nums){
            System.out.print(s + " ");
        }
    }
}