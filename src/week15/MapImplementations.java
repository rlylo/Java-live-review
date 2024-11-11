package week15;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapImplementations {
    public static void main(String[] args) {

        //A - 90, B-80, C-70, D-60
        Map<Character, Integer> gradeScale = new HashMap<>(Map.of('A', 90, 'B', 80));
        gradeScale.put('D', 60);

        gradeScale.put('C', 70);

        System.out.println(gradeScale);
        System.out.println(gradeScale.size());
        System.out.println(gradeScale.get('A'));
        System.out.println(gradeScale.keySet());
        System.out.println(gradeScale.values());

        //remove key + value pair using key
        gradeScale.remove('D');
        System.out.println(gradeScale);

        //check if key is present in a hashmap
        if (gradeScale.containsKey('B')) {
            System.out.println("B is present with value = " + gradeScale.get('B'));
        }


        System.out.println("===========Linked HashMap");
        Map<String, String> message = new LinkedHashMap<>();
        message.put("sender", "202-10-1234");
        message.put("receiver", "432-234-1133");
        message.put("message = ", "Hello,how are you?");
        System.out.println("message = " + message);

        System.out.println("========== TREE MAP ===========");
        //sorts the keys
        Map<String, String> codes = new TreeMap<>();
        codes.put("US", "United States");
        codes.put("CA", "Canada");
        codes.put("GB", "United Kingdom");
        codes.put("FR", "France");
        codes.put("DE", "Germany");
        codes.put("JP", "Japan");
        codes.put("IN", "India");
        codes.put("BR", "Brazil");
        codes.put("CN", "China");
        codes.put("ZA", "South Africa");

        System.out.println("codes = " + codes);

        System.out.println("=======LOOPING MAP==============");

        //slower
        for (String key : codes.keySet()) {
            System.out.println(key + " - " + codes.get(key));
        }

        //faster and proper way
        for (Map.Entry<String, String> each : codes.entrySet()) {
            System.out.println(each.getKey() + "->" + each.getValue());
        }

        //forEach method with lambda
        codes.forEach((k, v) -> System.out.println(k + " | " + v));


    }
}
