package Task3;
import java.util.Scanner;
public class CapitalizeAlternative {
	    public static String capitalizeAlternate(String str) {
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < str.length(); i++) {
	            if (i % 2 == 0) {
	                result.append(Character.toUpperCase(str.charAt(i)));
	            } else {
	                result.append(Character.toLowerCase(str.charAt(i)));
	            }
	        }
	        return result.toString();
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.next();
	        System.out.println("Output: " + capitalizeAlternate(input));
	        sc.close();
	    }
	}



