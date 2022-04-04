package Practice1;

public class LongestPallindromicSubstring {

    public static void main(String[] args) {
        String s = "abcccsssss";
        String s1 = longestPalindrome(s);
        System.out.println(s1);
    }

    public static String longestPalindrome(String s) {

        if(s == null || s.length() < 1  ) return "";

        int start=0,end=0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromMiddle(i, i, s);
            int len2 = expandFromMiddle(i, i + 1, s);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - ((len - 1) / 2);
                end = i + (len / 2);
            }
        }

        return s.substring(start,end+1);
    }

    static int expandFromMiddle(int left, int right, String s) {

        if (s == null || left > right) return 0;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }

}
