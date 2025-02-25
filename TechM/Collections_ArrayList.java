package TechM;
import java.util.*;
public class Collections_ArrayList {
	public static void main(String[] args) {
		ArrayList<String>names=new ArrayList<String>();
		names.add("Archanna");
		names.add("Sanjeevini");
		names.add("Papithra");
		names.add("Sowmya");
		
		System.out.println(names);
		System.out.println(names.get(2));
		names.add(4,"Victor");
		System.out.println(names);
		names.set(0, "Archu");
		System.out.println(names);
		names.remove(4);
		System.out.println(names);
		names.contains("Archanna");
		System.out.println(names);
		
	}

}
