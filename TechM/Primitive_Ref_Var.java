package TechM;

public class Primitive_Ref_Var {
	    // Method that modifies both primitive (int) and reference (array)
	    public static void modifyVariables(int num, int[] arr) {
	        num = 90;  // Modifying the primitive variable
	        arr[2] = 20; // Modifying the reference variable (array)
	    }

	    public static void main(String[] args) {
	        // Primitive variable (int)
	        int number = 30;

	        // Reference variable (array)
	        int[] numbersArray = {10, 20, 30};

	        // Printing original values before calling the method
	        System.out.println("Original number: " + number); // Outputs: 10
	        System.out.print("Original array: ");
	        for (int num : numbersArray) {
	            System.out.print(num + " "); // Outputs: 1 2 3
	        }

	        // Calling the method to modify the values
	        modifyVariables(number, numbersArray);

	        // Printing values after calling the method
	        System.out.println("\nAfter method call:");
	        System.out.println("Number: " + number); // Outputs: 10 (because it was passed by value)
	        System.out.print("Array: ");
	        for (int num : numbersArray) {
	            System.out.print(num + " "); // Outputs: 50 2 3 (because array was passed by reference)
	        }
	    }
	}



