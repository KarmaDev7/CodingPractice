package datastructures.stack;

import java.util.Objects;

public class MinStack{

    private Stack<Integer> mainStack;

    private Stack<Integer> minStack;


    public MinStack(){
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(Integer element){
        Integer top =element;
            if(!minStack.isEmpty())
             top = minStack.peek();

            if(top > element)
                minStack.push(element);
            else
                minStack.push(top);


        mainStack.push(element);
    }

    public Integer pop(){

        minStack.pop();
        return mainStack.pop();
    }

    public Integer getMin() {
        return minStack.peek();
    }
}
