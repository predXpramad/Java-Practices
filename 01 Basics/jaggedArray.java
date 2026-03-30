
public class jaggedArray {
    public static void main(String[] args) {
            int nums [][] = new int [3][]; //jagged array
            nums[0] = new int [4];
            nums[1] = new int [7];
            nums[2] = new int [5];
            
            for(int i = 0; i<nums.length; i++)
            {
                for(int j = 0;j<nums[i].length; j++)
                {
                    nums[i][j] = (int)(Math.random() * 10);
                }
            }

            for(int arr[]:nums)
            {
                for(int m: arr)
                {
                    System.out.print(m + " ");
                }
                System.out.println();
            }
    }
}
