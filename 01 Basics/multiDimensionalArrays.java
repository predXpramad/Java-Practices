
public class multiDimensionalArrays 
{
	public static void main(String[] args)
	{
		int nums [][] = new int [3][4];
		for(int i=0; i<3; i++)
		{
			for(int j = 0; j<4; j++)
			{
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		for(int i=0; i<3; i++)
		{
			for(int j = 0; j<4; j++)
			{
				nums[i][j] = (int) (Math.random() * 100); //Typecast after conversion
			}
			System.out.println();
		}
		for(int i=0; i<3; i++)
		{
			for(int j = 0; j<4; j++)
			{
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		
		// Enhanced for loop that takes array as input while printing
		for (int n[] :nums) //meaning is n is an 1-D array comming from "nums" multidimensional array.
		{
			for (int m: n) // meaning is n is an element from the 1-D array 'n'
			{
				System.out.print(m + " ");
			}
			System.out.println();
		}
	}
}