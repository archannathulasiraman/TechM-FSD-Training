package Task3;
import java.util.Arrays;
import java.util.List;
public class CountWordsUsingStreams {

	    public static void main(String[] args) {
	        List<String> words = Arrays.asList("apple", "banana", "apricot", "avocado", "blueberry");

	        long count = words.stream().filter(word -> word.startsWith("a")).count();

	        System.out.println("Words starting with 'a': " + count);
	    }
	}



