public class TestMultiplecatch {
	public static void main(String[] args) {
		try{
			int[] jalpinScores = new int[3];
			jalpinScores[0] = 95;
			jalpinScores[1] = 99;
			jalpinScores[2] = 90;
			
			jalpinScores[5] = 100;
		}catch (ArithmeticException e) {
			System.out.println("Arithmetic Error occurred.");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Error: jalpin accessed an invalid index!");
		}catch (Exception e) {
			System.out.println("General Exception Handler: " + e);
		}
	}
}