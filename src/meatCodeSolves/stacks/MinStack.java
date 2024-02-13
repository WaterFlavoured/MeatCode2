package meatCodeSolves.stacks;

// Question 155, needed the correct class name lol o lo l o l ol o  o o ol lo l ol ol ol olol
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
public class MinStack {
    public int[] stack;
    private int count;
    private int trash;

    public MinStack() {
        stack = new int[30000];
        count = 0;
    }

    public void push(int val) {
        stack[count] = val;
        count++;
    }

    public void pop() {
        trash = stack[count-1];
        stack[count-1] = 0;
        count--;
    }

    public int top() {
        int top = stack[0];

        for(int i = 0; i < stack.length; i++) {
            if(top > stack[i]) top = stack[i];
        }
        return top;
    }

    public int getMin() {
        int min = stack[0];
        for(int i = 0; i < stack.length; i++) {
            if(min < stack[i]) min = stack[i];
        }
        return min;
    }

}

