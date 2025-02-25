package TechM;
import java.util.*;
public class multiplication {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1=80;
	int num2=4;
	int num3=0;
	int count=0;
	for(int i=0;i<num2;i++) {
		num3 =num3 + num1;
	}
	System.out.println("Multi:"+ num3);
	
	while(num1!=0) {
		num1-=num2;
		count++;
		
	}
	System.out.println("Div:"+ count);

	 int a = 80;
     int b = 4;
     int sum = a;
     
     // Increment the sum using a loop
     for (int i = 0; i < b; i++) {
         sum++;
         
     }
     
     System.out.println("Sum:"+ sum);
     int result = a;
     for (int i = 0; i < b; i++) {
         result--;
     }
     
     System.out.println("Difference:"+ result);
 }
   
}

	
//multiply without *
//divide without /
//divide without %
//trailing zeros in factorial