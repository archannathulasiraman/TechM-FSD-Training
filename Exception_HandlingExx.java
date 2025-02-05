package TechM;
import java.util.*;
public class Exception_HandlingExx {
	    public static void processInput() {
	        Scanner s = new Scanner(System.in);
	        try {
	            System.out.print("Enter a number: ");
	            double number = Double.parseDouble(s.nextLine()); // Read user input and convert to double
	            
	            if (number == 0) {
	                throw new ArithmeticException("Cannot divide by zero.");
	            }

	            double reciprocal = 1 / number; // Calculate reciprocal
	            System.out.println("Reciprocal: " + reciprocal);
	        } 
	        catch (NumberFormatException e) {
	            System.out.println("Error: Invalid input. Please enter a valid number.");
	        } 
	        catch (ArithmeticException e) {
	            System.out.println("Error: " + e.getMessage());
	        } 
	        finally {
	            s.close();
	        }
	    }

	    public static void main(String[] args) {
	        processInput();
	    }
	}

