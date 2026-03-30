

public class arrays {
	public static void main(String args [])
	{
		int nums [] = {2,4,5,6}; //index start from 0
		System.out.println(nums[1]);
		nums[1] = 5;
		System.out.println(nums[1]);
		
		// Make array dynamic by decalring an array of particular size, it by default assigns value 0 at each position.
		int nums1 [] = new int [4];
		System.out.println(nums1[0]);
		System.out.println(nums1[1]);
		System.out.println(nums1[2]);
		System.out.println(nums1[3]);
		nums1[0] = 5; // Assiging values by index position
		nums1[1] = 6;
		nums1[2] = 7;
		nums1[3] = 10;
        int i = 0;
		while(i < 4)
		{
			System.out.println(nums1[i]);
			i++;
		}
	}
}