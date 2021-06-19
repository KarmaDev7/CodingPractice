package datastructures.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        queue.remove();

        System.out.println(queue);


        /**
         * Testing our own imlemented Queue
         */

        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(23);
        arrayQueue.enqueue(21);
        arrayQueue.enqueue(45);
        arrayQueue.enqueue(34);
        arrayQueue.enqueue(1);

        System.out.println(arrayQueue.peek());
        System.out.println(arrayQueue);

        arrayQueue.dequeue();
        System.out.println(arrayQueue);
        arrayQueue.enqueue(12);


        System.out.println(arrayQueue);
        System.out.println(arrayQueue.peek());
        arrayQueue.dequeue();

        System.out.println(arrayQueue);

    }




}
