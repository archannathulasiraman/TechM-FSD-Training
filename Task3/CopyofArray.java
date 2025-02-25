package Task3;
import java.util.Arrays;
public class CopyofArray {
	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

	        int[] copiedRange = Arrays.copyOfRange(numbers, 2, 5); // Copies elements from index 2 to 4 (exclusive of 5)

	        System.out.println("Original Array: " + Arrays.toString(numbers));
	        System.out.println("Copied Range: " + Arrays.toString(copiedRange));
	    }
	}



