package Task3;

public class CheckNum {
	    public static void validateEven(int num) throws OddNumException {
	        if (num % 2 != 0) {
	            throw new OddNumException("Number is odd: " + num);
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            validateEven(9); // Change the number to test
	        } catch (OddNumException e) {
	            System.out.println("Caught Exception: " + e.getMessage());
	        }
	    }
	}

