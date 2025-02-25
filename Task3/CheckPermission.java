package Task3;
import java.io.File;
public class CheckPermission {

	    public static void main(String[] args) {
	        File file = new File("C:\\Users\\Public\\test.txt"); // Change path accordingly
	        System.out.println("Readable: " + file.canRead());
	        System.out.println("Writable: " + file.canWrite());
	    }
	}


