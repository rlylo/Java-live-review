package week15;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Yassine", "Julia", "Marina", "Humaira", "Ozan"));
        System.out.println("===========For each loop============");
        for (String name : names) {
            System.out.println("name = " + name);

        }

        System.out.println("=========Iterator============");

        //1) Create Iterator object from list
        Iterator<String> it = names.iterator();
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.hasNext());

        Iterator<String> it2 = names.iterator();
        while (it2.hasNext()) {
            //System.out.println("name " + it2.next());
            if (it2.next().length()>7){
                it2.remove();
            }
        }
        System.out.println(names);


        System.out.println("===========removeIf===============");

        names.removeIf(name -> name.contains("O"));
        System.out.println(names);

        Set<String> words = new HashSet<>();
        words.add("Sunday");
        words.add("Laptop");
        words.add("Java");
        words.add("HTML");
        words.add("Selenium");

        Iterator<String> setIT = words.iterator();
        while (setIT.hasNext()){
            System.out.println(setIT.next());
        }
        System.out.println("=============remove java==============");
        List<String> list = new ArrayList<>(List.of("java","ruby","kotlin","c3","java","html"));
        //list.removeIf(p->p.equals("java"));
        System.out.println(list);
        Iterator<String> it1 = list.iterator();
        while (it1.hasNext()){
            if (it1.next().equals("java")){
                it1.remove();
            }
        }
        System.out.println(list);

    }
}
