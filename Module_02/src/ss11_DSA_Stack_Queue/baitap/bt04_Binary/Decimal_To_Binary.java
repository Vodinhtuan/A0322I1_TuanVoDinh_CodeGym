package ss11_DSA_Stack_Queue.baitap.bt04_Binary;

import java.util.Scanner;
import java.util.Stack;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int tempNum= num;
        while (tempNum>0){
            stack.push(num%2);
            tempNum/=2;
        }
        System.out.print(num + " Converting to binary is: ");
        while (!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }

}
