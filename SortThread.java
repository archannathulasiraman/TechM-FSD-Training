package Task3;
import java.util.Arrays;
public class SortThread extends Thread {

	    private int[] arr;

	    public SortThread(int[] arr) {
	        this.arr = arr;
	    }

	    public void run() {
	        Arrays.sort(arr);
	    }

	    public int[] getSortedArray() {
	        return arr;
	    }
	}
