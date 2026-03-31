class A
{
	int age;
	public void show()
	{
		System.out.println("in Main show");
	}
	
	static class B
	{
		public void config()
		{
			System.out.println("in B config");
		}
	}
}

public class Demo1
{
	public static void main(String args[])
	{
		A obj = new A(); 
		obj.show();
		
		A.B obj2 = new A.B(); //Only When inner class is Static
		obj2.config();
		
	}
}