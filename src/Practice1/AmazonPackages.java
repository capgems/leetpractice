package Practice1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AmazonPackages {

    public static void main(String[] args) {
        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("INSERT", "GT23513413"));
        queries.add(Arrays.asList("INSERT", "GT23513400"));
        queries.add(Arrays.asList("SHIP", "-"));
        queries.add(Arrays.asList("INSERT", "GT23519911"));
        queries.add(Arrays.asList("SHIP", "-"));
        List<List<String>> lists = performWareHousingQuery(queries);
        System.out.println(lists);
    }

    static List<List<String>> performWareHousingQuery(List<List<String>> queries) {

        ArrayDeque<String> dq = new ArrayDeque<>(3);
        List<List<String>> output = new ArrayList<>();
        for (List<String> query : queries) {
            String command = query.get(0);
            if (command.equals("INSERT")) {
                dq.addLast(query.get(1));
            } else {
                output.add(processShipment(dq));
            }

        }
        return output;

    }

    private static List<String> processShipment(ArrayDeque<String> dq) {
        List<String> out = new ArrayList<>();
        if (dq.size() >= 3) {
            out.add(dq.pollFirst());
            out.add(dq.pollFirst());
            out.add(dq.pollFirst());
        } else {
            out.add("N/A");
        }
        return out;
    }
}
