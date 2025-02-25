package TechM;

import java.util.Scanner;

public class Armstrong_num {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt(); // To get number to be check
		int temp = num; // store number in temp variable
		int sum = 0; // Initializing sum as 0
		while (num > 0) {
			int last = num % 10; // To get the last digit of number
			sum = (last * last * last) + sum; // To cube the digit and sum up all digits
			num = num / 10; // To get the remaining digits of the original number

		}
		if (temp == sum) { // check if sum and original number stored in temp variable are same
			System.out.println("is an Armstrong number");
		} else {
			System.out.println("not an Armstrong number");
		}
	}

}
