package Task3;
import java.util.List;
import java.util.ArrayList;
public class GenericMergeList {

	    public static <T> List<T> mergeAlternating(List<T> list1, List<T> list2) {
	        List<T> mergedList = new ArrayList<>();
	        int size = Math.max(list1.size(), list2.size());

	        for (int i = 0; i < size; i++) {
	            if (i < list1.size()) mergedList.add(list1.get(i));
	            if (i < list2.size()) mergedList.add(list2.get(i));
	        }

	        return mergedList;
	    }

	    public static void main(String[] args) {
	        List<String> listA = List.of("A", "C", "E");
	        List<String> listB = List.of("B", "D", "F", "G");

	        System.out.println("Merged List: " + mergeAlternating(listA, listB));
	    }
	}



