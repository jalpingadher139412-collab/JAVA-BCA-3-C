 class  VerifyIdentity
{
	 void verifyIdentity()
	{
		System.out.println("Student Jalpin Identity via Biometrics.");
	}
}
class Student extends VerifyIdentity
{
	void verifyIdentity()
	{
		System.out.print("Jalpin");
	}
}

public class Program19
{
	public static void main(String args[])
	{
		Student s = new Student();
		s.verifyIdentity();
	}
}