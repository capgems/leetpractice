package Practice2;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsInTwoSortedArrays {


    public static void main(String[] args) {
        findCommonElementsInSortedArrays(new int[]{1, 3, 4, 5}, new int[]{0, 1, 3, 4, 5}).forEach(System.out::println);
    }

    static List findCommonElementsInSortedArrays(int p[], int q[]) {

        List<Integer> output_arr = new ArrayList<>();
        int i = 0, j = 0;
        while (i < p.length && j < q.length) {
            if (p[i] == q[j]) {
                output_arr.add(p[i]);
                i++;
                j++;
            } else if (q[j] > p[i]) {
                i++;
            } else {
                j++;
            }
        }
        return output_arr;
    }

}
