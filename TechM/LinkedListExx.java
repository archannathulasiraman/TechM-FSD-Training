package TechM;
import java.util.*;
//import java.util.ArrayList;

public class LinkedListExx {
	public static void main(String[] args) {
		LinkedList<UserEntity> users = new LinkedList();
		users.add(new UserEntity("Archanna",21,"archanna2004@gmail.com","7656737376","pass123"));
		users.add(new UserEntity("Arch",22,"archanna4@gmail.com","7656737376","pass13"));
		users.add(new UserEntity("Archu",23,"archanna@gmail.com","7656737376","pass23"));
		users.forEach(user->System.out.println(user.toString()));
	}

}
