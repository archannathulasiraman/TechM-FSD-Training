package Task3;
import java.util.Arrays;
public class EqualsVSDeepEquals {
	    public static void main(String[] args) {
	        String[] arr1 = {"Archanna", "Abishek"};
	        String[] arr2 = {"Archanna", "Abishek"};
	        
	        System.out.println("Using equals(): " + Arrays.equals(arr1, arr2)); // true, because elements are same
	        System.out.println("Using deepEquals(): " + Arrays.deepEquals(arr1, arr2)); // true, works similarly for 1D arrays
	        
	        String[][] arr3 = {{"Archanna", "Abishek"}};
	        String[][] arr4 = {{"Archanna", "Abishek"}};
	        
	        System.out.println("Using equals() on 2D arrays: " + Arrays.equals(arr3, arr4)); // false, because it compares references
	        System.out.println("Using deepEquals() on 2D arrays: " + Arrays.deepEquals(arr3, arr4)); // true, compares values inside
	    }
	}


