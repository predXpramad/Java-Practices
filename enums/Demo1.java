enum status  // In java enums is interpreted as classes
{
	Running, Failed, Pending, Success; // Nameed Constant, not number or string
}

public class Demo1
{
	public static void main(String args [])
	{
		int a = 5;
		Status s = Status.Running;
        System.out.println(s);

        Status [] s1  = Status.values(); //Status.values() gives arrays

		for(Status str: s1 )
			System.err.println(str + " " + str.ordinal());
	}
}