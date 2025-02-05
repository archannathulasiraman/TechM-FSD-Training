package utility;
import utility.UtilityClass;
public class Main {
		    public static void main(String[] args) {
		        int number = 1234567;

		        // Accessing the static method without creating an object
		        int length = UtilityClass.findLength(number);

		        System.out.println("Length of " + number + " is: " + length);
		    }
	
	}


