package Task3;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
public class SortListUsingStreams {
	    public static void main(String[] args) {
	        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

	        List<String> ascending = words.stream().sorted().collect(Collectors.toList());
	        List<String> descending = words.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());

	        System.out.println("Ascending Order: " + ascending);
	        System.out.println("Descending Order: " + descending);
	    }
	}



