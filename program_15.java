class Vehicle{
	int speed = 120;
	Vehicle(){
		System.out.println("vehicle constructor Called");
	}
	void run()
	{
		System.out.println("vehicle is running");
	}
}

class car extends Vehicle
{
	int speed = 180;
	
	car()
	{
		super();
	}
	
	void display()
	{
		System.out.println("car Speed: "+ speed);
		System.out.println("Parent Vehicle Speed: " + super.speed);
		super.run();
	}
}
public class program_15
{
	public static void main(String args[])
	{
		car c = new car();
		c.display();
	}
}