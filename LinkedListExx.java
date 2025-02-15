package Task3;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExx {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("One");
		list.add("Two");
		list.addLast("Three");
		System.out.println("LinkedList: " + list);
		for (String item : list) {
			System.out.println(item);
		}

		ListIterator<String> iterator = list.listIterator(1);
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		ListIterator<String> revIterator = list.listIterator(list.size());
		while (revIterator.hasPrevious()) {
			System.out.println(revIterator.previous());
		}
		ListIterator<String> revIterator1 = list.listIterator(list.size());
		while (revIterator1.hasPrevious()) {
			System.out.println(revIterator1.previous());
		}
		list.add(1, "New Element");
		System.out.println("After insertion: " + list);
		list.addFirst("First");
		list.addLast("Last");
		System.out.println("After inserting first and last: " + list);
		list.addLast("End");
		System.out.println("After inserting at end: " + list);
		LinkedList<String> tempList = new LinkedList<>();
		tempList.add("Extra1");
		tempList.add("Extra2");
		list.addAll(2, tempList);
		System.out.println("After inserting elements: " + list);
		System.out.println("First element: " + list.getFirst());
		System.out.println("Last element: " + list.getLast());

	}
}
