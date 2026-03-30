interface Computer
{
	public abstract void code();
}

//Developer need laptop
class Laptop implements Computer
{
	public void code()
	{
		System.out.println("code, compile and run..");
	}
}

//But we cannot expect company to give us laptop, they can also give desktop
class Desktop implements Computer
{
	public void code()
	{
		System.out.println("code, compile and run..:Faster");
	}
}

class Developer
{
	public void devApp(Computer comp)
	{
		comp.code();
	}
}

public class Demo1
{
	public static void main(String a[])
	{
		Computer lap = new Laptop();
		Computer desk = new Desktop();

		Developer prasad = new Developer();
		prasad.devApp(lap);
	}

}