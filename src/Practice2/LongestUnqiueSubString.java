package Practice2;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LongestUnqiueSubString {

    public static void main(String[] args) {
        System.out.println(longestUniqueSubString("abcabcbb"));
    }

    static int longestUniqueSubString(String s) {
        HashSet<Character> set = new LinkedHashSet<>();

        int i = 0, j = 0, max = Integer.MIN_VALUE;

        while (i < s.length()) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                i++;
                max = Math.max(set.size(), max);
            } else {
                set.remove(s.charAt(i));
                j++;
            }
        }
        return max;
    }
}
