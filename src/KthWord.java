import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class KthWord {
    public static List<String> topKFrequent(String[] words, int k) {

        List list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : words) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }

        }


        Map<String, Integer> sortByValueMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue(),
                        (entry1, entry2) -> entry2, LinkedHashMap::new));
        System.out.println(sortByValueMap);

        return list;
    }




    public static void main(String[] args) {

        String [] strings= {"i","i","love","lot","and","love"};
        List<String> l= topKFrequent(strings,2);
//        System.out.println(l);
    }
}
