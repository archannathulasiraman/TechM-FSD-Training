package Task3;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListExx {

	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        System.out.println("Colors: " + colors);
	        for (String color : colors) {
	            System.out.println(color);
	        }
	        colors.add(0, "Black");
	        System.out.println("After inserting at first position: " + colors);
	        System.out.println("Element at index 2: " + colors.get(2));
	        colors.set(1, "White");
	        System.out.println("After updating: " + colors);
	        System.out.println("Contains 'Blue'? " + colors.contains("Blue"));
	       
	        Collections.sort(colors);
	        System.out.println("Sorted List: " + colors);
	        ArrayList<String> newColors = new ArrayList<>(colors);
	        System.out.println("Copied List: " + newColors);
	        Collections.shuffle(colors);
	        System.out.println("Shuffled List: " + colors);

	    }
	}



