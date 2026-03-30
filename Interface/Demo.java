interface A
{
	// Interface provide design
	void show();
	void config();
}

// Like class inherits parent class, we need to implement design(Interface)
class B implements A
{
	public void show()
	{
		System.out.println("Implemented show");
	}
	public void config()
	{
		System.out.println("Implemented config");
	}
}


class Demo
{
	public static void main(String [] args)
	{
		//Create referece of class
		A obj;
		//
		obj = new B();
		obj.show();
		obj.config();
	}
}