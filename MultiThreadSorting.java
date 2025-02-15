package Task3;

import java.util.Arrays;

public class MultiThreadSorting {
	public static void main(String[] args) {
        int[] array = {7, 3, 9, 2, 6, 1, 8, 4, 5};
        
        SortThread sortThread = new SortThread(array);
        sortThread.start();
        
        try {
            sortThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sorted Array: " + Arrays.toString(sortThread.getSortedArray()));
    }



}



