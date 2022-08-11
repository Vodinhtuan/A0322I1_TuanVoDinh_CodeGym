package ss11_DSA_Stack_Queue.baitap;

import java.util.Stack;

public class Bt01ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        int length = stack.size();
        Stack<Integer> wStack1 = new Stack<Integer>();
        for (int i = 0; i<length; i++) {
            wStack1.push(stack.pop());
        }
        System.out.println(wStack1);
    }

}
