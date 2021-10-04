package exceptions;

public class DuplicateInputException extends Exception {
	public DuplicateInputException() {
		super("Same Input Detected!");
	}
}
