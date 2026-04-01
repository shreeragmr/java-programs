package Arrays;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static Character findFirstNonRepeating(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first non-repeating character
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return null; // if no unique character found
    }

    public static void main(String[] args) {
        String input = "aabccdeff";

        Character result = findFirstNonRepeating(input);

        if (result != null) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No unique character found");
        }
    }
}