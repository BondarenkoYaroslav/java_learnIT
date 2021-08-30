package core.collections.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        intStack.push(5);
//        LIFO
        while (!intStack.empty()) {
            System.out.println(intStack.pop());
        }
    }
}
