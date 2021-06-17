package datastructures.stack;

import java.util.Stack;

public class ReverseAString {

    public static void main(String[] args) {
        String str = "abcd";


        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        StringBuilder stringBuilder = new StringBuilder();

        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }

        System.out.println(stringBuilder.toString());





    }
}
