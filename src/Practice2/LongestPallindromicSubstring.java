package Practice2;

public class LongestPallindromicSubstring {
    // expand from middle technique.

    public static void main(String[] args) {
        System.out.println(longestPallindromicString("sdaaracecarlkl"));
    }

    static String longestPallindromicString(String s) {



        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandMiddle(s, i, i);
            int len2 = expandMiddle(s, i + 1, i);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - ((len - 1) / 2);
                end = i + (len / 2);
            }
        }

        return s.substring(start, end + 1);
    }

    static int expandMiddle(String s, int right, int left) {

        if (s == null) return 0;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }

}
