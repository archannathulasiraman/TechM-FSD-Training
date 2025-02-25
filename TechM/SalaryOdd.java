package TechM;
import java.util.*;
public class SalaryOdd {

	public static void main(String[] args) {
		ArrayList <Integer>salary=new ArrayList<Integer>();
		ArrayList <Double>salary1=new ArrayList<Double>();
		Scanner s = new Scanner(System.in);
	
		for(int i=0;i<6;i++) {
			int num=s.nextInt();
			salary.add(num);
//			if(num%2!=0) {
//				int num1 = num*num;
//				salary1.add(num1);
			if(num>50) {
				double num1=num+(num*0.1);
				salary1.add(num1);
				
				
			
			}	
			}
		System.out.println(salary1);
			
		}
		
	}


