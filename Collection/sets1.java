import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class sets1 {
    public static void main(String[] args) {
        Collection<Integer> nums = new TreeSet<>();
        nums.add(5);
        nums.add(51);
        nums.add(15);
        nums.add(5);
        nums.add(25); 
        // for(Integer a: nums){
        //     System.out.println(a);
        // } Another way is using iterator which is parent class of Iterable with is parent class of Collections
        Iterator<Integer> values  = nums.iterator();
        while(values.hasNext())
            System.out.println(values.next());
    }
}
