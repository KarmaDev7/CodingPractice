package datastructures.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<T> {

    //TODO
    //implement push,pop,peek,isEmpty,
    private Object[] elements;

    private int top = -1;

    private static final int INITIAL_CAPACITY = 10;


    public Stack() {
        elements = new Object[INITIAL_CAPACITY];
    }

    public void push(T element){
        if(++top >= elements.length)
            throw new StackOverflowError();

        elements[top] = element;

    }

    public synchronized T pop(){

        if(elements.length == 0)
            throw new EmptyStackException();

        T element = peek();

        /* to let gc do its work */
        elements[top--] = null;

        return element;

    }

    public T peek() {
        if (top == -1)
            return (T) new Integer(Integer.MAX_VALUE);

        return (T) elements[top];
    }

    public Boolean isEmpty(){

        return top == -1;
    }
    @Override
    public String toString() {
        Object[] objects = Arrays.copyOfRange(elements, 0, top+1);
        return Arrays.toString(objects);
    }
}
