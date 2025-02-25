package TechM;

public class complexity {
//Big O notation
//O(1)-constant time complexity
//O(n)- Linear time complexity
//O(n^2)- Quadratic time complexity
//O(log n)- Logarithmic time complexity
//O(n!)- Factorial time complexity
	public static void main(String[]a) {
		int num1=5;
		int num2=0;
		int div=0;
		try {
			if(num1==0 | num2==0) {
				throw new ArithmeticException(" pujium thavarana input");
			}
			
		div=num1/num2;
		}
		catch(ArithmeticException e){
			System.out.println("Exception handling" + e.getMessage());
		//System.out.println(div);
		//java.lang.ArithmeticException
	}
		finally {
			System.out.println(div);
		}
	}
	// immediate start and close of scanner class - illegal state exception
}
