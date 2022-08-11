package ss11_DSA_Stack_Queue.baitap;

import java.util.Scanner;
import java.util.Stack;

public class BracketStack {
    static String isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push((s.charAt(i)));
            }else {
                if(stack.isEmpty()){
                    return "FALSE";
                }else {
                    char pop_val = stack.pop();
                    if (s.charAt(i) ==')'&& pop_val !='('){
                        return "FALSE";
                    }else if (s.charAt(i) == '}' && pop_val !='{'){
                        return "FALSE";
                    }else if (s.charAt(i) ==']' && pop_val !='['){
                        return "FALSE";
                    }
                }
            }
        } if (stack.isEmpty()){
            return "TRUE";
        }else {
            return "FALSE";
        }
    }

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");
        String input = sc.nextLine();
        System.out.println(isBalanced(input));
    }
}
