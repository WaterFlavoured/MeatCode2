package meatCodeSolves.stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution20a {
    public static void main(String[] args) {
        Solution20a sol = new Solution20a();
        String s = "{}{}";
        System.out.println(sol.isValid(s));
    }

    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> bracketLookup = new HashMap<>(3);

        bracketLookup.put(')', '(');
        bracketLookup.put('}', '{');
        bracketLookup.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // sets char at c
            if (bracketLookup.containsKey(c)) {
//                Checks whether the stack is empty, then checks whether the value is equal to peek
                if (!brackets.isEmpty() && bracketLookup.get(c).equals(brackets.peek())) {
                    brackets.pop();
                } else {
                    return false;
                }
            } else {
                // Pushes a {, (, or [
                brackets.push(c);
            }
        }

        return brackets.isEmpty();
    }
}
