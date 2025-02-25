package Task3;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
public class ReadPlainText {
	    public static void main(String[] args) throws IOException {
	        Path filePath = Path.of("C:\\Users\\Public\\test.txt"); // Change path accordingly
	        List<String> lines = Files.readAllLines(filePath);
	        lines.forEach(System.out::println);
	    }
	}



