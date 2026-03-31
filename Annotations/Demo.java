class A
{
	public void PrintThatYouAreInShow()
	{
		System.out.println("in A show");
	}
	
}

class B extends A
{
	@Override
	public void PrintThatYouAreInShow()
	{
		System.out.println("in B show");
	}
	
}

public class Demo
{
	public static void main(String args [])
	{
		A obj = new B();
		obj.PrintThatYouAreInShow(); // I was expecting B class, but i got A class. Here i made a small mistake, so these kind of error is called logical error
	}
}