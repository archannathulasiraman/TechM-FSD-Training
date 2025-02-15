package Task3;
import java.util.ArrayList;
import java.util.List;
public class PrimeSumThread extends Thread {

	    private int start, end;
	    private long sum = 0;

	    public PrimeSumThread(int start, int end) {
	        this.start = start;
	        this.end = end;
	    }

	    private boolean isPrime(int num) {
	        if (num < 2) return false;
	        for (int i = 2; i * i <= num; i++) {
	            if (num % i == 0) return false;
	        }
	        return true;
	    }

	    public void run() {
	        for (int i = start; i <= end; i++) {
	            if (isPrime(i)) {
	                sum += i;
	            }
	        }
	    }

	    public long getSum() {
	        return sum;
	    }
	}


