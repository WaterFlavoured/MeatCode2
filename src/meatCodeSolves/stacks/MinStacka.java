package meatCodeSolves.stacks;

import java.util.Stack;

public class MinStacka {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStacka() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);

        // The min stack may be empty, so we need to check it
        val = Math.min(val, minStack.isEmpty() ? val : minStack.peek()); // ternary operator xDDDD
        minStack.push(val);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
