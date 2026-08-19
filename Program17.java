abstract class Animal
{
	public abstract void animalSound();
	
	public void sleep()
	{
	 System.out.println("Zzzzzzzz");
}
}

class Dog extends Animal
{
	public void animalSound()
	{
		System.out.println("The Dog says: Woof...Woof");
	}
}

 public class Program17
 {
	 public static void main(String[] args)
	 {
		 Dog myDog = new Dog();
		 myDog.animalSound();
		 myDog.sleep();
	 }
 }