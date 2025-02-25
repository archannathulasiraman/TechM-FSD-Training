package TechM;

public class Recursion {
	

	public static void main(String[] args) {
		recursiveCall(1);
		// TODO Auto-generated method stub

	}
	public static void recursiveCall(int n) {
		if(n>100) { // Range validity till 100
			return;
		}
		System.out.println(n); //To print from 1 - 100
			recursiveCall(n+1);
			//System.out.println(n); To print from 100 -1
		
	}

}
