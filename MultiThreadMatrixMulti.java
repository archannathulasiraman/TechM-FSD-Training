package Task3;

public class MultiThreadMatrixMulti {
	 public static void main(String[] args) {
	        int[][] A = {{1, 2}, {3, 4}};
	        int[][] B = {{5, 6}, {7, 8}};
	        int rows = A.length, cols = B[0].length, size = A[0].length;
	        int[][] result = new int[rows][cols];

	        Thread[][] threads = new Thread[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                threads[i][j] = new MaatrixMultiplicationThread();
	                threads[i][j].start();
	            }
	        }

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                try {
	                    threads[i][j].join();
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        }

	        System.out.println("Resultant Matrix:");
	        for (int[] row : result) {
	            for (int val : row) {
	                System.out.print(val + " ");
	            }
	            System.out.println();
	        }
	    }



}


