package Task3;
import java.io.File;
import java.util.Arrays;
public class FileListExtention {
	    public static void main(String[] args) {
	        File folder = new File("C:\\Users\\Public"); // Change path accordingly
	        String extension = ".txt"; // Change extension as needed

	        Arrays.stream(folder.list((dir, name) -> name.endsWith(extension)))
	              .forEach(System.out::println);
	    }
	}



