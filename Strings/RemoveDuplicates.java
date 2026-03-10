package Strings;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        
        String str = "java programming";
                                                                //set does not accept duplicates
        LinkedHashSet<Character> set = new LinkedHashSet<>();   //linkdedhashest maintains the insertion order

        for(int i = 0; i < str.length(); i++){
            set.add(str.charAt(i));
        }

        StringBuilder s = new StringBuilder();

        for(char c : set){
            s.append(c);
        } 

        System.out.println(s);
        
    }
}
