package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Alist {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Tom");
		list.add("jerry");
		list.add("Bob");
		list.add("Sam");
		
		ListIterator<String> iterator = list.listIterator();
		
		System.out.println("Forward");
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
		
		System.out.println("Backward");
		
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		
	}
}
