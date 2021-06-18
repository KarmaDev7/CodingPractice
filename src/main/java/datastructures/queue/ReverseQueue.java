package datastructures.queue;

import java.util.ArrayDeque;
import java.util.Queue;


/**
 * Reverse the given queue with following method add,remove and isEmpty
 */
public class ReverseQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(50);

        //queue.remove();
        System.out.println("Queue before reversing "+ queue);
       reverseQueue(queue);
        System.out.println( "Reversed queue: "+queue);
    }

    private static void reverseQueue(Queue<Integer> queue) {

        if(queue.isEmpty()){
            return;
        }

        int a = queue.remove();

        reverseQueue(queue);

        queue.add(a);
    }
}
