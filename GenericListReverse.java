package Task3;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class GenericListReverse {
	    public static <T> List<T> reverseList(List<T> list) {
	        List<T> reversedList = new ArrayList<>(list);
	        Collections.reverse(reversedList);
	        return reversedList;
	    }

	    public static void main(String[] args) {
	        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
	        System.out.println("Original List: " + numbers);
	        System.out.println("Reversed List: " + reverseList(numbers));
	    }
	}



