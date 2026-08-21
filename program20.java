interface animal
{
	void makesound();
	void eat();
}

class dog implements animal
{
	public void makesound()
	{
		System.out.println("woof!");
	}
	public void eat()
	{
		System.out.println("dog is eating dog food.");
	}
}
class cat implements animal
{
	public void makesound()
	{
		System.out.println("meow!");
	}
	public void eat()
	{
		System.out.println("cat is eating cat food.");
	}
}
public class program20
{
	public static void main(String[] args)
	{
		animal dog=new dog();
		animal cat=new cat();
		
		System.out.println("dog:");
		dog.makesound();
		dog.eat();
		
		System.out.println("\ncat:");
		cat.makesound();
		cat.eat();
	}
}
