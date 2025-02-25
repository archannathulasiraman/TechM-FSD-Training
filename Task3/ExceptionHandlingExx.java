package Task3;

public class ExceptionHandlingExx {
	    public static void main(String[] args) {
	        try {
	            throw new Exception("This is a custom exception.");
	        } catch (Exception e) {
	            System.out.println("Caught Exception: " + e.getMessage());
	        }
	    }
	}

