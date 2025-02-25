package TechM;

public class Prime {
	    public static boolean isPrime(int n) {
	        if (n <= 1) {
	            return false; 
	        }
	        for (int i = 2; i <= n/2; i++) {
	            if (n % i == 0) {
	                return false; 
	            }
	        }
	        return true; 
	    }

	    public static void main(String[] args) {
	        int[] numbers = {11, 2, 1, 5, 9, 22, 29}; // Example array
	        System.out.println("Prime numbers in the array:");
	        for (int num : numbers) {
	            if (isPrime(num)) {
	                System.out.print(num + " ");
	            }
	        }
	    }
	}


