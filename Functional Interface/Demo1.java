@FunctionalInterface //Helps keep warn to keep only one method
interface A //SAM
{
	void show();
}

@FunctionalInterface
interface B //SAM
{
	void show(int i);
}

@FunctionalInterface
interface C //SAM
{
	void add(int i, int j);
}

@FunctionalInterface
interface D //SAM
{
	int add(int i, int j);
}


public class Demo1
{
	public static void main(String args [])
	{
		A obj = () -> System.out.println("In show");
		// or
        B obj1 = (i) -> System.out.println("In show" + " " + i );
		// or
        B obj2 = i -> System.out.println("In show" + " " + i );
        // or
        C obj3 = (i,j) -> System.out.println(i + " + " + "j" + " = " + (i+j));
		obj.show();
		obj1.show(5);
		obj2.show(54);
        obj3.add(55,66);

        // or
        D obj4 = (i,j) -> (i+j); // Just a Lambda function
        double result = (double) obj4.add(55,66);
        System.out.println(result);
		
	}
}