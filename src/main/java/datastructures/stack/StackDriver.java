package datastructures.stack;

public class StackDriver {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());

        System.out.println(stack);
        stack.pop();

        System.out.println(stack);
        System.out.println(stack.peek());

        MinStack minStack = new MinStack();

        minStack.push(15);
        minStack.push(1);
        minStack.push(12);
        minStack.push(11);
        minStack.push(8);
        minStack.push(2);
        minStack.pop();
        minStack.push(-1);
        minStack.pop();


        System.out.println(minStack.getMin());

    }
}
