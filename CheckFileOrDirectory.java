package Task3;
import java.io.File;

public class CheckFileOrDirectory {
	    public static void main(String[] args) {
	        File path = new File("C:\\Users\\Public"); // Change path accordingly
	        if (path.isDirectory()) {
	            System.out.println("It is a Directory.");
	        } else if (path.isFile()) {
	            System.out.println("It is a File.");
	        } else {
	            System.out.println("Path does not exist.");
	        }
	    }
	}

