package Task3;
import java.io.File;
import java.util.Arrays;
public class ListFiles {
	    public static void main(String[] args) {
	        File directory = new File("C:\\Users\\Public"); // Change path accordingly
	        if (directory.exists() && directory.isDirectory()) {
	            Arrays.stream(directory.list()).forEach(System.out::println);
	        } else {
	            System.out.println("Directory does not exist.");
	        }
	    }
}
