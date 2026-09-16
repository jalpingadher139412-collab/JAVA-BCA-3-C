public class TestTrycatch {
	public static void main(String[] args) {
		String studentname = "jalpin";
		System.out.println(studentname + " started math calculation...");
		
		try{
			int totalmarks = 100;
			int subjects = 0;
			int result = totalmarks / subjects;
			
			System.out.println("Result: " + result);
		}
		catch (ArithmeticException e) {
			System.out.println("Exception Caught: division by zero is not allowed for " + studentname + "!");
			System.out.println("System Error Detail: " + e.getMessage());
		}
		System.out.println(studentname + "'s program continues execution smoothly!");
	}
}