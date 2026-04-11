// package Stream API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,9,6,3);
        System.out.println(nums); //prints nums list

        //What is i want to double it and print
        int sum = 0;
        for(int n: nums){
            if(n%2 ==0){
                n *= 2;
                sum +=n;
            }
        }
        System.out.println(sum);
        System.out.println();

        //Second Way of printing using foreach that implements Consumers Interface
        nums.forEach(i -> System.out.print(i + " "));

        System.out.println();
        System.out.println();

        // We can do same use streamAPI in faster way using 
        // Map, Reduce, Filter
        Stream<Integer> s1 = nums.stream(); //Keeps original Value as it is.
        s1.forEach(j -> System.out.print(j + " ")); 
        //once we use a stream object, we cannot use it again
        // s1.forEach(j -> System.out.print(j + " ")); 

        System.out.println();
        System.out.println();

        // Then use of stream is it provides lot of features which we can use to perform operations on.
        Stream<Integer> s2 = nums.stream().filter(n -> n%2 ==0);
        s2.forEach(i -> System.out.print(i + " "));
        
        //Map
        System.out.println();
        System.out.println();
        Stream<Integer> s3 = nums.stream().map(n -> n*2);
        s3.forEach(i -> System.out.print(i + " "));

        //Reduce -> Return value of Type specified
        System.out.println();
        System.out.println();
        int result= nums.stream().reduce(0,(c,e) ->c+e);
        System.out.println(result);
        System.out.println();

        // Apply all at once
        int result1 = nums.stream()
                            .filter(n -> n%2 ==0)
                            .map(n -> n*2)
                            .reduce(0,(a,b) -> a+b);
        
        System.out.println(result1);

    }
}
