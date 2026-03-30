// package encapsulate;

class Human
{
	// Whenever you create instance variable keep it `private`. Only inside the class 'Human' we can make use of the private variables.
	// We use Setter and Getters
	private int age; // Can be accessible only in the same class  
	private String name; //instance variable
	public int getAge() {
		return age;
	}
	public void setAge(int age) { //here age is local variable
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
}

public class encap
{
	public static void main(String a[])
    {
		Human obj = new Human();
		// obj.age =11;
		// obj.name = "Thanu";
        obj.setName("Rahul");
        obj.setAge(34);
		System.out.println(obj.getName() + ":" + obj.getAge());
	}
}
