
public class demo {
	public static void main(String[] args) {
		//int num1 = 5;
		//int num2 = 6;
		//int result = num1 + num2;
		//System.out.println(result);
		//add(3,3); // Won't working, becaues method is not in same class. So we need an Virtual object (Instance of class) to call the method
		//Calculator calc; // We created a reference, but not created object yet. Remember, wherever we create an object it consumes some space. So we we 'new' keyword with class name to create space for that object in memory.
		// That comes to ->
		Calculator calc = new Calculator();
        int result = calc.add(5,6);
        System.out.println(result);
	}
}

class Calculator
{
	//ADD is behaviour, we create method. public means we can access from anywhere, int is return type, add is method name
	public int add(int a, int b)
	{
		
		return a + b;
	}
}