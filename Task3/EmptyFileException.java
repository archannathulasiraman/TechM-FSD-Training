package Task3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class EmptyFileException {
	    public static void checkEmptyFile(String fileName) throws Exception {
	        File file = new File(fileName);
	        if (!file.exists()) {
	            throw new FileNotFoundException("File not found.");
	        }
	        
	        Scanner scanner = new Scanner(file);
	        if (!scanner.hasNextLine()) {
	            scanner.close();
	            throw new Exception("File is empty.");
	        }

	        while (scanner.hasNextLine()) {
	            System.out.println(scanner.nextLine());
	        }
	        scanner.close();
	    }

	    public static void main(String[] args) {
	        try {
	            checkEmptyFile("emptyfile.txt"); // Change filename to test
	        } catch (Exception e) {
	            System.out.println("Caught Exception: " + e.getMessage());
	        }
	    }
	}



