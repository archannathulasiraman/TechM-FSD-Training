package Task3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class NoPositiveNumAllowed {
	    public static void checkNegativeNumbers(String fileName) throws Exception {
	        File file = new File(fileName);
	        Scanner scanner = new Scanner(file);
	        
	        while (scanner.hasNext()) {
	            int number = scanner.nextInt();
	            if (number > 0) {
	                scanner.close();
	                throw new Exception("Positive number found: " + number);
	            }
	        }
	        scanner.close();
	    }

	    public static void main(String[] args) {
	        try {
	            checkNegativeNumbers("numbers.txt"); // Change filename to test
	        } catch (Exception e) {
	            System.out.println("Caught Exception: " + e.getMessage());
	        }
	    }
	}



