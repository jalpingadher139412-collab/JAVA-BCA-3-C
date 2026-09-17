class InvalidStudentMarksException extends Exception {
	public InvalidStudentMarksException(String message) {
	super(message);
	}
}

public class TestCustomException {
	static void validatejalpinMarks(double marks) throws InvalidStudentMarksException {
		if (marks < 0.0 || marks > 100.0) {
			throw new InvalidStudentMarksException("Marks must be between 0 and 100! Input was: " + marks);
		}else{
			System.out.println("jalpin's Marks validated Successfully: " + marks);
		}
	}
	
	public static void main(String[] args) {
		try{
			System.out.println("Submitting Exam Score for jalpin...");
			validatejalpinMarks(105.5);
		}
catch (InvalidStudentMarksException e) {
System.out.println("Custom Exception Caught: " + e.getMessage());
}
	}
}
	