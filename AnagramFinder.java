package TechM;
import java.util.*;
public class AnagramFinder {
	    public static List<Integer> findAnagrams(String s, String p) {
	        List<Integer> result = new ArrayList<>();
	        if (s == null || p == null || s.length() < p.length()) {
	            return result;
	        }

	        // Create frequency arrays for p and the current window in s
	        int[] pCount = new int[26];
	        int[] sCount = new int[26];

	        // Fill the frequency array for p
	        for (char c : p.toCharArray()) {
	            pCount[c - 'a']++;
	        }

	        // Initialize the sliding window
	        int pLength = p.length();
	        for (int i = 0; i < pLength; i++) {
	            sCount[s.charAt(i) - 'a']++;
	        }

	        // Compare the frequency arrays and add the index to the result if they match
	        if (matches(pCount, sCount)) {
	            result.add(0);
	        }

	        // Slide the window over s
	        for (int i = pLength; i < s.length(); i++) {
	            // Add the new character to the window
	            sCount[s.charAt(i) - 'a']++;
	            // Remove the old character from the window
	            sCount[s.charAt(i - pLength) - 'a']--;

	            // Compare the frequency arrays
	            if (matches(pCount, sCount)) {
	                result.add(i - pLength + 1);
	            }
	        }

	        return result;
	    }

	    // Helper method to compare the frequency arrays
	    private static boolean matches(int[] pCount, int[] sCount) {
	        for (int i = 0; i < 26; i++) {
	            if (pCount[i] != sCount[i]) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        String s = "cbaebabacd";
	        String p = "abc";

	        List<Integer> result = findAnagrams(s, p);
	        System.out.println(result);  // Output: [0, 6]
	    }
	}

