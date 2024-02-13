package meatCodeSolves.stacks;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-1);


        System.out.println(Arrays.toString(minStack.stack));
    }
}
