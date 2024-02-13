package meatCodeSolves.stacks;

import java.util.Stack;

public class Solution20 {
    public static void main(String[] args) {
        Solution20 sol = new Solution20();

        System.out.println(sol.isValid("{[]}"));
    }

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();

        char[] c = s.toCharArray();

        for(char bracket : c) {
            if(bracket == '{' || bracket == '(' || bracket == '[') {
                stack.push(bracket);
            }else if (stack.isEmpty()) {
                return false;
            }else {
                if((bracket == '}' && stack.peek() == '{') || (bracket == ']' && stack.peek() == '[') || (bracket == ')' && stack.peek() == '(')) {
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
