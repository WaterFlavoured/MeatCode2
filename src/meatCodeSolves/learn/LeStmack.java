package meatCodeSolves.learn;
import java.util.Stack;
public class LeStmack {
    public static void main(String[] args) {
        /*
        * Stack = LIFO data structure; Last-In-First-Out
        *         stores objects into a sort of "vertical tower"
        *         push() to add to the top
        *         pop() to remove from the top
        */

        Stack<String> stack = new Stack<String>();

//        System.out.println(stack.empty()); // gives boolean value

        // adds objects to the stack
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Borderlands");
        stack.push("Palworld");
        stack.push("Ethan Zhao");

        // removes objects from the stack (last object)
        stack.pop();

        // You can assign it to a variable as pop() returns the object
        String myFavGame = stack.pop();

        System.out.println(stack);
        System.out.println(myFavGame);
        System.out.println(stack.peek()); // this returns the topmost object

        System.out.println(stack.search("Skyrim")); // if not in the stack, it will return -1

        for(int i = 0; i < 1000000000; i++) {
            stack.push("Fallout76");
        } // this will eventually send an error as stacks aren't infinite

        /*
        * Use of Stacks?
        * 1. Undo/redo features in text editors
        * 2. moving back/forward through browser history
        * 3. backtracking algorithms (maze, file directories)
        * 4. calling functions (call stack)
        */
    }
}
