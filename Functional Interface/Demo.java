@FunctionalInterface //Helps keep warn to keep only one method
interface A //SAM
{
	void show();
}

class B implements A
{
	public void show()
	{
		System.out.println("In show B");
	}
}

public class Demo
{
	public static void main(String args [])
	{
		A obj1 = new B();
        obj1.show();
		//or 
		A obj = new A() //Anonyomous Method
		{
			public void show()
			{
				System.out.println("In show");
			}
		};
		obj.show();
	}
}