package by.svirski.lesson4.task1.utils;

public class ProjectException extends Exception {

	private static final long serialVersionUID = 1L;

	public ProjectException() {

	}

	public ProjectException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProjectException(Throwable cause) {
		super(cause);
	}

	public ProjectException(String message) {
		super(message);
	}
}
