package Practice2;

public class AtoI {

    public static void main(String[] args) {
        extractFromAscii("  -33");
    }

    static void extractFromAscii(String str) {

        int[] allowedRanges = {33, 43, 45, 48, 57};
        //int [] restricted = { 65,90,97,122 };

        StringBuilder output = new StringBuilder("");
        for (int j = 0; j < str.length(); j++) {
            int asci = str.charAt(j);
            if (asci >= allowedRanges[0] && asci <= allowedRanges[3]) {
                output.append(str.charAt(j));
            } else {
                if (j == 0 && asci != 32) {
                    output.append(0);
                    break;
                }
            }
        }

        System.out.println(Integer.valueOf(String.valueOf(output)));
    }
}
