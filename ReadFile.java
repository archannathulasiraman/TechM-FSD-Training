package Task3;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
public class ReadFile {
	    public static void main(String[] args) throws IOException {
	        File file = new File("C:\\Users\\Public\\test.txt"); // Change path accordingly
	        byte[] fileData = Files.readAllBytes(file.toPath());
	        System.out.println(new String(fileData)); // Convert bytes to string
	    }
	}



