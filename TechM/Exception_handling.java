package TechM;
import java.util.*;
public class Exception_handling {
	 public static void processInput() {
	        Scanner scanner = new Scanner(System.in);
	        try {
	            System.out.print("Enter a number: ");
	            double number = scanner.nextDouble();
	            double reciprocal = 1 / number;
	            System.out.println("Reciprocal: " + reciprocal);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Cannot divide by zero.");
	        } catch (Exception e) {
	            System.out.println("Error: Invalid input. Please enter a valid number.");
	        } finally {
	            scanner.close();
	        }
	    }
}


