// package Stream API;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ParallelStreamDemo {
    public static void main(String[] args) {

        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);
        Random rand = new Random();
        for(int i = 0; i<size; i++)
            nums.add(rand.nextInt(50,100));

        // System.out.println(nums);
        // Add Numbers
        int sum1 = nums.stream()
                            .map(i -> i*2)
                            .reduce(0,(i,j)-> i+j);

        //Alternative add
        long preStream = System.currentTimeMillis();
        //Sequential Stream
        int sum2 = nums.stream()
                            .map(i -> {
                                try{
                                    Thread.sleep(1);
                                }catch(Exception e){}
                                return i*2;
                            })
                            .mapToInt(i -> i)
                            .sum();
        long postStream = System.currentTimeMillis();

        long preParallel = System.currentTimeMillis();
        // Parallel Stream
        int sum3 = nums.parallelStream()
                            .map(i -> {
                                try{
                                    Thread.sleep(1);
                                }catch(Exception e){}
                                return i*2;
                            })
                            .mapToInt(i -> i)
                            .sum();
        long postParallel= System.currentTimeMillis();

        System.out.println("sum1: " + sum1 + " sum2: " + sum2 + " Sum3 : " + sum3);
        System.out.println("Sequential: " + (postStream - preStream));
        System.out.println("Parallel: " + (postParallel - preParallel));

    }    
}
