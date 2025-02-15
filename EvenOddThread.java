package Task3;

public class EvenOddThread {
	 public static void main(String[] args) {
	        EvenThread evenThread = new EvenThread();
	        OddThread oddThread = new OddThread();
	        
	        evenThread.start();
	        oddThread.start();
	    }
	}


