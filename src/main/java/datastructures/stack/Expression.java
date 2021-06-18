package datastructures.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {

    private String input;
    private final List<Character> leftBrackets = Arrays.asList('{', '<', '[', '(');
    private final List<Character> rightBrackets = Arrays.asList('}', '>', ']', ')');

    public Expression(String input) {
        this.input = input;
    }

    public static void main(String[] args) {

        Expression expression = new Expression("{sumit}}");
        Boolean balanced = expression.isBalanced();
        System.out.println(balanced);

    }

    public Boolean isBalanced() {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {

            if (isLeftBracket(c)) {
                stack.push(c);
            } else if (isRightBracket(c)) {

                 if (stack.isEmpty())  return false;

                Character top = stack.pop();

                if (!bracketMatch(c, top))
                    return false;

            }

        }
        return stack.isEmpty();
    }

    private boolean bracketMatch(char left, Character right) {
        /**
         * index of closing & opening brackets should be same while defining them else this logic will fail.
         */
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }


    private boolean isRightBracket(char c) {
        return rightBrackets.contains(c);
    }

    private boolean isLeftBracket(char c) {
        return leftBrackets.contains(c);
    }


}
