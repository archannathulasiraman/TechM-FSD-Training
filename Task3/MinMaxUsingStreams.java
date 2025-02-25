package Task3;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxUsingStreams {

	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(5, 12, 3, 19, 25, 7, 1);

	        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
	        Optional<Integer> min = numbers.stream().min(Integer::compareTo);

	        System.out.println("Maximum Value: " + (max.isPresent() ? max.get() : "No values"));
	        System.out.println("Minimum Value: " + (min.isPresent() ? min.get() : "No values"));
	    }
	}



