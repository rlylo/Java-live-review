package week15;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();//uses its own priority system , influenced by natural order
        queue.add(3);
        queue.add(1);
        queue.add(10);
        queue.add(4);
        queue.add(0);
        System.out.println(queue);

        queue.addAll(Arrays.asList(1,5,3,66,4,2));
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        while (queue.size()>0){
            System.out.println(queue.poll());
        }
        System.out.println("queue = " + queue);

        System.out.println("===============ArrayDeque==================");

        ArrayDeque<String> arrDeque = new ArrayDeque<>();
        arrDeque.addAll(Arrays.asList("java","automation","Scrum master","Sprints"));

        System.out.println("arrDeque = " + arrDeque);
        System.out.println("arrDeque.poll() = " + arrDeque.poll());
        System.out.println("arrDeque.poll() = " + arrDeque.poll());
        arrDeque.offer("javascript");
        System.out.println(arrDeque);
        arrDeque.offerFirst("Roman");
        System.out.println("arrDeque = " + arrDeque);


    }
}
