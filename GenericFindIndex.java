package Task3;
import java.util.List;
public class GenericFindIndex {
	    public static <T> int findIndex(List<T> list, T target) {
	        return list.indexOf(target);
	    }

	    public static void main(String[] args) {
	        List<String> names = List.of("Archanna", "Archu", "Achu", "Archan");
	        System.out.println("Index of 'Achu': " + findIndex(names, "Achu"));
	        System.out.println("Index of 'Archu': " + findIndex(names, "Archu"));
	    }
	}



