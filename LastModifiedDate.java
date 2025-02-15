package Task3;
	import java.io.File;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	public class LastModifiedDate {
	    public static void main(String[] args) {
	        File file = new File("C:\\Users\\Public\\test.txt"); // Change path accordingly
	        if (file.exists()) {
	            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	            System.out.println("Last Modified: " + sdf.format(new Date(file.lastModified())));
	        } else {
	            System.out.println("File does not exist.");
	        }
	    }
	}


