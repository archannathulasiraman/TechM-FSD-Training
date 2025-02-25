package TechM;
import java.util.*;
public class Practice {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        int num=number/2;
	        if (num*2==number) { 
	            System.out.println(number + " is even.");
	        } else {
	            System.out.println(number + " is odd.");
	        }

	        scanner.close();
	    }
	}

