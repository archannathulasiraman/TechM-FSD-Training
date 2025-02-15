package Task3;

import java.util.ArrayList;
import java.util.List;

public class PrimeSumMultiThread {
	 public static void main(String[] args) {
	        int limit = 100;
	        int numThreads = 4;
	        int chunkSize = limit / numThreads;
	        List<PrimeSumThread> threads = new ArrayList<>();

	        for (int i = 0; i < numThreads; i++) {
	            int start = i * chunkSize + 1;
	            int end = (i == numThreads - 1) ? limit : (i + 1) * chunkSize;
	            PrimeSumThread thread = new PrimeSumThread(start, end);
	            threads.add(thread);
	            thread.start();
	        }

	        long totalSum = 0;
	        for (PrimeSumThread thread : threads) {
	            try {
	                thread.join();
	                totalSum += thread.getSum();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	        System.out.println("Sum of Prime Numbers up to " + limit + ": " + totalSum);
	    }
	}




