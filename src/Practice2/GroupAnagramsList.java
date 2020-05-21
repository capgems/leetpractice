package Practice2;

import java.lang.reflect.Array;
import java.util.*;

public class GroupAnagramsList {

    public static void main(String[] args) {
        System.out.println(groupAnagramList(new String[]{"ate", "tea", "fossi", "issof", "amma", "nana", "anan"}));
    }

    static List<List<String>> groupAnagramList(String[] strings) {
//group anagrams needs to be finded out in a given string array
        List<List<String>> anagrams = new ArrayList<>();
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String str : strings) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            if (!anagramMap.containsKey(sortedString)) {
                anagramMap.put(sortedString, new LinkedList<>());
            }
            anagramMap.get(sortedString).add(str);
        }
        anagrams.addAll(anagramMap.values());
        return anagrams;
    }
}
