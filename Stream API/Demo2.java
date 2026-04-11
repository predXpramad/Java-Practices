// package Stream API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(8,2,7,1,9,6);
        // Single thread
        Stream<Integer> SortedValues = nums.stream()
                                        .filter(a -> a%2==0)
                                        .map(a -> a*2)
                                        .sorted();
        SortedValues.forEach(n -> System.out.println(n));
        System.out.println();
        // Multiple thread
        Stream<Integer> manage = nums.parallelStream()
                                        .filter(a -> a>=5)
                                        .map(a -> a*3);
        manage.forEach(a -> System.out.println(a));

    }    
}


