package TechM;

public class BookNotFondException extends Exception {
	    public BookNotFondException(String message) { super(message); }
	}

	class UserNotFoundException extends Exception {
	    public UserNotFoundException(String message) { super(message); }
	}

	class MaxBooksAllowedException extends Exception {
	    public MaxBooksAllowedException(String message) { super(message); }
	}


