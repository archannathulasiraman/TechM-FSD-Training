package Task3;

public class MaatrixMultiplicationThread extends Thread  {
	    private int[][] A, B, result;
	    private int row, col, size;

	    public void MatrixMultiplicationThread(int[][] A, int[][] B, int[][] result, int row, int col, int size) {
	        this.A = A;
	        this.B = B;
	        this.result = result;
	        this.row = row;
	        this.col = col;
	        this.size = size;
	    }

	    public void run() {
	        for (int k = 0; k < size; k++) {
	            result[row][col] += A[row][k] * B[k][col];
	        }
	    }
	}

	   