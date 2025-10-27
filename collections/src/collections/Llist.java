package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class Llist {

	public static void main(String[] args) {
		
		LinkedList<String> list = new  LinkedList<>();
		
		list.add("john");
		list.add("Bob");
		list.add("tom");
		list.add("jerry");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println("\nAfter removal:");
		for(String name:list) {
			System.out.println(name);
		}
		
		list.addFirst("jack");
		list.addLast("howard");
		
		ListIterator<String> iterator = list.listIterator();
		
		System.out.println("\nAfter adding:");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
