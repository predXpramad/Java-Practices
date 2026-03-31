class A
{
	public void show()
	{
		System.out.println("This is A");
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("This is B");
	}
}

class C extends A
{
	public void show()
	{
		System.out.println("This is C");
	}
}

public class Demo
{
	public static void main(String args [])
	{
		A obj = new A(); // Reference A object A
		obj.show(); //execute show in class A
		
		A obj2 =  new B(); // Reference type A(parent) Object B(Child)
		obj2.show(); //Execute show in B
		
		obj2 = new A(); // breaks old link of memeory address to B and assigns new memory address of oject A.
		obj2.show(); // Executes A
		
		obj2 = new C();
		obj2.show(); // Executes C
		
		
	}
}