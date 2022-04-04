package Practice1;

import java.util.HashMap;
import java.util.Map;

public class FindMaxAndMinFrequency {

    public static void main(String[] args) {
        String s = "bbacccabab";
        int i = finalStringFreq(s);
        System.out.println(i);
    }

    static int finalStringFreq(String s) {
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            len = Math.max(len, expandFromMiddle(i, i, s));
        }
        return len;
    }

    static int expandFromMiddle(int left, int right, String s) {
        int freq = 0;
        while (left >= 0 && right < s.length()) {
            freq = Math.max(freq, calcFreq(s.substring(left, right + 1)));
            left--;
            right++;
        }
        return freq;
    }

    static int calcFreq(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        Integer max = map.values().stream().mapToInt(v -> v).max().getAsInt();
        Integer min = map.values().stream().mapToInt(v -> v).min().getAsInt();
        return max - min;
    }

}

