import java.util.Scanner;

public class IfSorted {
    public static boolean truth(int size){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<size-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        boolean trueness = truth(size);
        if(trueness)
            System.out.println("In accending order");
        else
            System.out.println("Not in accending order");

        
    }
}
