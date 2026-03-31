class A
{
	int age;
	public void show()
	{
		System.out.println("in Main show");
	}
	
	class B
	{
		public void config()
		{
			System.out.println("in B config");
		}
	}
}

public class Demo
{
	public static void main(String args[])
	{
		A obj = new A(); //Create object of class A
		obj.show();
		
		//To Access inner class B in A
		A.B obj2; // Create a reference variable for B class in A
		
		
		obj2 = obj.new B(); // creates an object for class B by taking A's object 'obj' that we created earlier.
		obj2.config();
		
	}
}