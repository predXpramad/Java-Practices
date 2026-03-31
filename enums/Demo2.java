enum Laptop
{
	Macbook(3000), XPS, Surface(1500), ThinkPad(1000); //passing values to named constants that act here as passing value to constructor to create objects
	private int price;
	//We seperately create constructor for class
	private Laptop(int price)
	{
		this.price = price;
	}
	
	Laptop() {
		price = 500;
	}

	// Generate getter and setter
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public int getPrice()
	{
		return price;
	}
}

public class Demo2
{
	public static void main(String args [])
	{
		Laptop lap = Laptop.Macbook;
		System.out.println(lap.getPrice());
		lap.setPrice(2500);
		System.out.println(lap.getPrice());
		for(Laptop l: Laptop.values())
		{
			System.out.println(l + " : " + l.getPrice());
		}
	}
}
