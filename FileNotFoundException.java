package Task3;
import java.io.File;
import java.util.Scanner;
public class FileNotFoundException {
	    public static void readFile(String fileName) throws Exception {
	        File file = new File(fileName);
	        Scanner scanner = new Scanner(file);
	        while (scanner.hasNextLine()) {
	            System.out.println(scanner.nextLine());
	        }
	        scanner.close();
	    }

	    public static void main(String[] args) {
	        try {
	            readFile("nonexistent.txt"); // Change filename to test
	        } catch (Exception e) {
	            System.out.println("Caught Exception: File not found.");
	        }
	    }
	}



