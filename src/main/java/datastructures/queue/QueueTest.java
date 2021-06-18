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
    }




}
