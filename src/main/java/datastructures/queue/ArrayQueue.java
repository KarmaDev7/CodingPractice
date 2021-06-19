package datastructures.queue;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Implement queue using array:
 * enqueue()
 * dequeue()
 * peek()
 * isEmpty()
 * isFull()
 */
public class ArrayQueue {

    private int frontPointer;
    private int rearPointer;
    private int count;
    private Integer elements[];

    public ArrayQueue() {
        elements = new Integer[5];

        frontPointer = rearPointer = 0;
    }

    public void enqueue(int element) {

        if (count == elements.length)
            throw new StackOverflowError();

        this.elements[rearPointer] = element;
        /**
         * implement circular array to utilize free space
         */
        rearPointer = (rearPointer + 1) % elements.length;

        count++;

    }

    public void dequeue() {

        this.elements[frontPointer] = null;

        frontPointer = (frontPointer + 1) % elements.length;
        count--;


    }

    public int peek() {

        if (frontPointer == -1)
            throw new EmptyStackException();

        return elements[frontPointer];
    }

    public boolean isEmpty() {
        return frontPointer == rearPointer;
    }

    public boolean isFull() {
        return rearPointer == elements.length - 1;
    }

    @Override
    public String toString() {
          return Arrays.toString(elements);
    }
}
