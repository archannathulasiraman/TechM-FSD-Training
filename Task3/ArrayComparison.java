package Task3;
import java.util.Arrays;
public class ArrayComparison {

	    public static <T> boolean areArraysEqual(T[] arr1, T[] arr2) {
	        return Arrays.equals(arr1, arr2);
	    }

	    public static void main(String[] args) {
	        Integer[] array1 = {1, 2, 3, 4};
	        Integer[] array2 = {1, 2, 3, 4};
	        Integer[] array3 = {1, 2, 3, 5};

	        System.out.println("Are array1 and array2 equal? " + areArraysEqual(array1, array2));
	        System.out.println("Are array1 and array3 equal? " + areArraysEqual(array1, array3));
	    }
	}


