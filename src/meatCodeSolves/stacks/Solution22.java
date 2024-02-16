package meatCodeSolves.stacks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Solution22 {
    public static void main(String[] args) {
        Solution22 sol = new Solution22();

        System.out.println(sol.generateParenthesis(15));
        System.out.println(count);
    }

    Stack<Character> stack = new Stack<>();
    List<String> res = new ArrayList<>();
    static int count = 0;

    public List<String> generateParenthesis(int n) {
        backtrack(0,0, n);
        return res;
    }

    private void backtrack(int openN, int closedN, int n) {
        if(openN == closedN && closedN == n) {
            String temp = "";
            for(char c : stack) {
                temp += c;
            }
            res.add(temp);
            count++;
        }
        if(openN < n) {
            stack.push('(');
            backtrack(openN+1, closedN, n);

            stack.pop();
        }
        if(closedN < openN) {
            stack.push(')');
            backtrack(openN, closedN+1, n);
            stack.pop();
        }
    }
}
