package TechM;

import java.util.*;

public class Trailing_zeros {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int power=1;
		long numOfZeros=0;
		while(n>=(int)Math.pow(5, power)) {
			numOfZeros+=(n/(int)Math.pow(5, power));
			power+=1;
			
		}
		System.out.println(numOfZeros);
			
		}
//		long numOfZeros = 0;
//		for (int i = 5; n / i > 0; i *= 5) {
//			numOfZeros += n / i;
//		}
//
//		System.out.println(numOfZeros);
//
//	}

}
