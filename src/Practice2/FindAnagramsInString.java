package Practice2;

import java.util.ArrayList;
import java.util.List;

public class FindAnagramsInString {

    public static void main(String[] args) {
        String s = "bacaba";
        String p = "abc";
        System.out.println(findAnagram(s,p));
    }

    static List<Integer> findAnagram(String p, String q) {

        int[] freq = new int[212];
        List<Integer> result = new ArrayList<>();

        if ( p.length() == 0) return result;

        for (int i = 0; i < q.length(); i++) {
            freq[q.charAt(i) - 'a']++;
        }

        int count = q.length(), right = 0, left = 0;

        while (right < p.length()) {
            if (freq[p.charAt(right++) - 'a']-- >= 1) {
                count--;
            }

            if (count == 0) result.add(left);

            if (right - left == q.length() && freq[p.charAt(left++) - 'a']++ >= 0) {
                count++;
            }
        }

        return result;
    }


}
