package TechM;
import java.util.*;
public class practice2 {
	public static void main(String[]args) {
		int arr1[]= {1,2,3,5,9,7};
		Scanner s = new Scanner(System.in);
		int arr2[]=new int[6];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=s.nextInt();
}
	for(int i=0;i<arr1.length;i++) {
		if(arr1[i]==arr2[i]) {
			System.out.println("same");
		}
		else {
			System.out.println("Different");
		}
	}
}
}
