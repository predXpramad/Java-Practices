class A
{
	public void show()
	{
		System.out.println("in a show");
	}
}

class Demo
{
	public static void main(String args [])
	{
		// Creating new Anonymous inner class in main method itself
		A obj = new A()
		{
			//Overriedes A class's show method
			public void show()
			{
				System.out.println("in new show");
			}
		};
        obj.show();
	}
}