package datastructures.stack;

import java.util.EmptyStackException;
import java.util.Objects;

// We need two stacks to implement a min stack.
// One stack holds the values, the other stack
// (called minStack) holds the minimums.
public class MinStack {

    private Stack<Integer> mainStack;

    private Stack<Integer> minStack;


    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(Integer element) {

        mainStack.push(element);

        if (minStack.isEmpty()) {
            minStack.push(element);
        } else if (element < minStack.peek())
            minStack.push(element);

    }

    public Integer pop() {
        if (mainStack.isEmpty())
            throw new EmptyStackException();

        Integer top = mainStack.pop();

        if(top == minStack.peek())
             minStack.pop();

        return top;
    }

    public Integer getMin() {
        return minStack.peek();
    }
}
