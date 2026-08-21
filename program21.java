interface puppy 
{
	void soundpuppy();
}
interface meow extends puppy
{
	void soundmeow();
}

class dog implements meow
{
	public void soundpuppy()
	{
		System.out.println("wooff!!!");
	}
	public void soundmeow()
	{
		System.out.println("meow!!!");
	}
}

public class program21
{
	public static void main(String[] args)
	{
		dog c = new dog();
		c.soundpuppy();
		c.soundmeow();
	}
}
