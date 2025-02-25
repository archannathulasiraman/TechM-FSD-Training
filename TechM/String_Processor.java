package TechM;

public class String_Processor {

	    // Method to reverse a string
	    public static String reverseString(String str) {
	        StringBuilder reversed = new StringBuilder(str);
	        return reversed.reverse().toString();
	    }

	    // Method to count occurrences of a substring within a string
	    public static int countOccurrences(String text, String sub) {
	        int count = 0;
	        int index = 0;

	        while ((index = text.indexOf(sub, index)) != -1) {
	            count++;
	            index += sub.length(); // Move index to the end of the last match
	        }
	        return count;
	    }

	    // Method to split a string by spaces and capitalize each word
	    public static String splitAndCapitalize(String str) {
	        String[] words = str.split(" ");
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            if (!word.isEmpty()) {
	                result.append(word.substring(0, 1).toUpperCase()) // Capitalize first letter
	                      .append(word.substring(1).toLowerCase())   // Keep the rest in lowercase
	                      .append(" "); // Add space between words
	            }
	        }

	        // Remove the trailing space and return the result
	        return result.toString().trim();
	    }

	    public static void main(String[] args) {
	        // Test reverseString method
	        String str = "Archanna";
	        System.out.println("Reversed String: " + reverseString(str));

	        // Test countOccurrences method
	        String text = "I am Archanna, My name is Archanna, I am being called as Archanna .";
	        String sub = "Archanna";
	        System.out.println("Occurrences of 'test': " + countOccurrences(text, sub));

	        // Test splitAndCapitalize method
	        String sentence = "My name is Archanna";
	        System.out.println("Capitalized String: " + splitAndCapitalize(sentence));
	    }
	}



