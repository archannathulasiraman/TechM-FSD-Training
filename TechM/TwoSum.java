package TechM;
import java.util.*;
public class TwoSum {
	public static void main(String[]a) {
		Scanner s = new Scanner(System.in);
		int[]twosum= {1,2,3,4,5};
		int target=9;
		for(int i=0;i<twosum.length;i++) {
			for(int j=0;j<twosum.length;j++) {
				if(twosum[i]+twosum[j]==target) {
					int result[]= {twosum[i],twosum[j]};
					System.out.println(Arrays.toString(result));
					// System.out.println("("+twosum[i] + "," + twosum[j]+")");
				}
			}
		}
	}

}
