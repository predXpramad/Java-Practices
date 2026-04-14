// package 06 DSA.03 Recusion.Java Code;

public class RecusionDemo {
    public static void main(String[] args) {
        int res = factorial(10);
        System.out.println(res);

        int res1 = fibonacci(10);
        System.out.println(res1);

        System.out.println("fib Series:");
        printFibonacci(5);
    }
    
    public static int factorial(int i){
        
        if(i!=0)
            return i*factorial(i-1);
        return 1;
    }

    public static int fibonacci(int i){
        if (i<=1) return i;
        return fibonacci(i-1) + fibonacci(i-2);
    }

    // Iterative Approach
    public static void printFibonacci(int n){
        int a = 0, b = 1;
        for(var i = 1; i<=n; i++){
            System.out.print(a + " ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
}
