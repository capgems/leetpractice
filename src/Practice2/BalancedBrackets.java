package Practice2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        String characters = "[{]";
        System.out.println(checkBalance(characters));
    }

   static boolean checkBalance(String s) {

        Map<Character, Character> m = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        m.put(')', '(');
        m.put(']', '[');
        m.put('}', '{');

        for (int i = 0; i < s.length(); i++) {
            if (m.containsKey(s.charAt(i))) {
                if (stack.pop() != m.get(s.charAt(i))) {
                    return false;
                }
            } else {
                stack.push(s.charAt(i));
            }
        }

        return true;
    }

}
