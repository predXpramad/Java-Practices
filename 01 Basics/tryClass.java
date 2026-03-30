
class Computer
{
	public void playMusic() // behavior,which is public and has retrun type void or nothing.
	{
		System.out.println("Playing music");
	}
	
	public String getMeAPen(int cost)
	{
		if (cost >= 10)
			return "Pen";

		return "Nothing";
	}	
}

public class tryClass
{
	public static void main(String [] args)
	{
		Computer obj = new Computer(); 
		// new Computer() is creating an object using memory space
		// 'Computer obj' is creating only a reference to store object, like 'int num' to create refernce to store an integer value and later access the property and behavior of the object.
		obj.playMusic();
		String str = obj.getMeAPen(1);
        System.out.println(str);
	}
}