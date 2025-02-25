package Task3;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class RemoveDuplicatesUsingStreams {

	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 6, 7, 5, 8);

	        List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());

	        System.out.println("Unique Numbers: " + uniqueNumbers);
	    }
	}



