package week15;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplementations {
    public static void main(String[] args) {

        System.out.println("==================HASHSET===================");
        Set<String> hashSet = new HashSet<>();
        hashSet.add(null);
        hashSet.add("hello worlds");
        hashSet.add("5.0");
        hashSet.add("@zebra");
        hashSet.add("UHC");
        hashSet.add("java");
        hashSet.add("java");
        System.out.println("hashSet = " + hashSet);

        for (String each : hashSet) {
            System.out.println(each);
        }
        
        hashSet.forEach(el -> System.out.println("el = " + el));

        //maintains insertion order
        Set<String> linked = new LinkedHashSet<>();
        linked.add(null);
        linked.add("hello world");
        linked.add("5.0");
        linked.add("@zebra");
        linked.add("UHC");
        linked.add("java");
        linked.add("java");
        System.out.println("linked = " + linked);

        System.out.println(linked.contains("@zebra"));

        System.out.println("===========TreeSet=======================");
        //sorts values in natural order
        Set<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(5);
        sortedSet.add(0);
        sortedSet.add(-3);
        sortedSet.add(45);
        System.out.println("sortedSet = " + sortedSet);
        //sortedSet.fi


    }
}
