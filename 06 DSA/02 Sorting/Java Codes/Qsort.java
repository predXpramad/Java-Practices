// package 06 DSA.02 Sorting.Java Codes;
// 4 - Quick Sort - we can consider pivot in many ways, but we here 
// consider as last element.
// Works based on Divide-and-Conquor Rule.

public class Qsort {
    public static void main(String[] args) {
        int[] arr = {8,5,7,4,6,1};
        // Before Sorting
        System.out.println("Before Sorting");
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();        
        
        //Method 1
        System.out.println("Method 1");
        int[] res = quickSort(arr, 0, arr.length-1);
        System.out.println("Method 1 Result:");
        for(int num: res){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static int[] quickSort(int[] arr, int low, int high){
        if(low<high)
        {
            int p = partition(arr, low, high);
            quickSort(arr, low,p-1 );
            quickSort(arr, p+1, high);
        }
        return arr;
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low -1;
        
        for(int j=low; j<high;j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }



}
