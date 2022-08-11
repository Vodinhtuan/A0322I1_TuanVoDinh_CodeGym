package ss11_DSA_Stack_Queue.baitap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter something: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Queue<Character> queue = new LinkedList<>();
        for (int i = input.length() - 1; i>=0; i--){
            queue.add(input.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()){
            reverseString = reverseString+queue.remove();
        }
        if (input.equals(reverseString)){
            System.out.println("The input String is a Palindrome");
        }else{
            System.out.println("The input String is not a Palindrome");
        }
    }

}
