package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        
        String str1 = "worth";
        String str2 = "throw";

        char[] s1 = str1.toCharArray(); 
        char[] s2 = str2.toCharArray();
        
        Arrays.sort(s1);
        Arrays.sort(s2);

        if(Arrays.equals(s1,s2))
            System.out.println("Anagram");
        
        else
            System.out.println("Not Anagram");
    }
}
