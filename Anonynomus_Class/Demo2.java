abstract class A
{
	public abstract void show();
}

class Demo2
{
	public static void main(String args [])
	{
		// Creating new Anonymous inner class in main method itself
		A obj = new A()
		{
			//Overriedes A class's show method
			public void show()
			{
				System.out.println("Bybyebye");
			}
		};
		obj.show();
	}
}