public class constructor {
    public static void main(String a[])
    {
		Human obj = new Human(); //default value before using constructor is age:0, name:null 

        Human obj1 = new Human( "Rahul", 54);   //Parameterized Constructor
        System.out.println(obj1.getName() + ":" + obj1.getAge());
		System.out.println(obj.getName() + ":" + obj.getAge());
        obj.setName("Rahul");
        obj.setAge(34);
		System.out.println(obj.getName() + ":" + obj.getAge());
	}
    
}


class Human
{
	private String name;
	private int age;
	
	public Human() // Default Constructor - Values are asigned already 
	{
		age = 45;
		name = "John";
	}

    //Constructor Overriding
    public Human(String name, int age)  //Parameterized Constructor
    {
        this.age = age;
        this.name =name;
    }

	public Human(String name) { //Parameterized Constructor
        this.name = name;
    }

    public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
}

