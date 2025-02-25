package Task3;
import java.io.File;
public class CheckFileExistence {
	    public static void main(String[] args) {
	        File file = new File("C:\\Users\\Public\\test.txt"); // Change path accordingly
	        System.out.println(file.exists() ? "File/Directory exists." : "File/Directory does not exist.");
	    }
	}



