public class EncapsuleEx
{
	private String name;
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	public static void main(String[] args)
	{
		EncapsuleEx emp =new EncapsuleEx();
		emp.setname("jalpin gadher");
		System.out.println("employee name: " + emp.getname());
	}
}