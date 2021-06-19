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

        if (isFull())
            throw new StackOverflowError();

        this.elements[rearPointer] = element;
        /**
         * implement circular array to utilize free space
         */
        rearPointer = (rearPointer + 1) % elements.length;

        count++;

    }

    public int dequeue() {
        if (isEmpty())
            throw new EmptyStackException();

        int element = this.elements[frontPointer];

        this.elements[frontPointer] = null;
        frontPointer = (frontPointer + 1) % elements.length;
        count--;

        return element;
    }

    public int peek() {

        if (isEmpty())
            throw new EmptyStackException();

        return elements[frontPointer];
    }

    public boolean isEmpty() {
        return count ==0;
    }

    public boolean isFull() {
        return count == elements.length;
    }

    @Override
    public String toString() {
          return Arrays.toString(elements);
    }
}
