public class TestThrow {

    public static void checkVotingEligibility(int age, String studentname) {

        if (age < 18) {
            throw new ArithmeticException(
                studentname + " is not eligible to vote (age must be 18+)."
            );
        } else {
            System.out.println(studentname + " is eligible to vote!");
        }
    }

    public static void main(String[] args) {

        try {
            System.out.println("Checking registration for Jalpin...");
            checkVotingEligibility(16, "Jalpin");
        } 
        catch (ArithmeticException e) {
            System.out.println("Caught Explicit Exception: " + e.getMessage());
        }
    }
}