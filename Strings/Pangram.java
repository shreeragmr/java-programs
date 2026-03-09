package Strings;

import java.util.HashSet;
import java.util.Set;


public class Pangram {

	public static void main(String[] args) {
		
		String s1 = "The quick brown fox jumps over the lazy dog";
		
		if(isPangram(s1)) {
			System.out.println("Pangram");
		}
		else {
			System.out.println("Not pangram");
		}
		
	}
	
	public static boolean isPangram(String s1) {
		
		s1 = s1.toLowerCase();
		
		char[] arr = s1.toCharArray();
		
		Set<Character> set = new HashSet<>();
		
		for(Character c:arr) {
			if(c>='a' && c<='z') {
				set.add(c);
			}
		}
		
		if(set.size()==26) {
			return true;
		}
		return false;
	}
}
