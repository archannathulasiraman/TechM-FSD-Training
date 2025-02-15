package Task3;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class ReadLineByLine {
	    public static void main(String[] args) throws IOException {
	        Path filePath = Path.of("C:\\Users\\Public\\test.txt"); // Change path accordingly
	        Files.lines(filePath).forEach(System.out::println);
	    }
	}



