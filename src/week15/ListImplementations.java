package week15;

import java.util.*;

public class ListImplementations {
    public static void main(String[] args) {

        List<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('J');
        list.add('Y');

        System.out.println(list);
        System.out.println(list.size());

        List<Integer> list2 = new ArrayList<>(1000);
        list2.add(232);
        list2.add(121);
        list2.add(32323);
        list2.add(22112);
        Random rd = new Random();
        for (int i = 0; i <= 1000; i++) {
            list2.add(rd.nextInt(500));
        }
        System.out.println(list2);

        System.out.println("==================LINKEDLIST======================");

        List<String> list3 = new LinkedList<>();
        list3.add("Agile scrum");
        list3.add("Waterfall");
        list3.add("Java");
        list3.add("git and github");
        System.out.println(list3);

        System.out.println("================VECTOR=========================");
        List<Integer> list4 = new Vector<>();
        List<Integer> list5 = Collections.synchronizedList(new ArrayList<>());

        System.out.println("==================STACK=======================");
        /*
        push -> adds a value to top of stack
        peek -> gets value from top of stack, without removing
        pop -> gets value from top of tack , by removing it
         */
        Stack<String> stack = new Stack<>();
        stack.push("bird");
        stack.push("butterfly");
        stack.push("golf gish");
        stack.push("sun");
        stack.push("java");
        System.out.println("stack = " + stack);

        System.out.println("stack.peek() = " + stack.peek());

        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());


        System.out.println("stack = " + stack);


    }
}
