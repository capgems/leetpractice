package Practice1;

import java.util.HashSet;

public class TestVirus {

    public static void main(String[] args) {
        boolean adafaha = testString("ADAFAHF");
        System.out.println(adafaha);
    }

    public static boolean testString(String str){
       char [] arr =  str.toCharArray();
       boolean contains = false;
        HashSet set = new HashSet();
        for(int i=0;i<str.length();i++){
            if(i % 2 ==0) {
                if (set.contains(arr[i])) {
                    contains = true;
                } else {
                    set.add(arr[i]);
                    contains = !contains;
                }
            }
        }
        return contains;
    }
}
