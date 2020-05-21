package Practice2;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(findNonRepeatingCharacter("ssfgdfgbcv"));
    }

    static char findNonRepeatingCharacter(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), 1);
            } else {
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
            }
        }

        for (int j = 0; j < s.length(); j++) {
            if (hashMap.get(s.charAt(j)) == 1) {
                return s.charAt(j);
            }

        }
        return Character.MAX_HIGH_SURROGATE;
    }
}
