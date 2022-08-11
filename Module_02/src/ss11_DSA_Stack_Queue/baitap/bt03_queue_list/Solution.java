package ss11_DSA_Stack_Queue.baitap.bt03_queue_list;

import java.util.Scanner;

public class Solution {

    private static Queue queue=new Queue();
    public static void main(String[] args) {
        enQueue();
        System.out.println();
        deQueue();
    }

    public static void enQueue()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        for (int i=1; i<10; i++)
        {
            int input = scanner.nextInt();
            queue.enqueue(input);
            System.out.print(input+" ");
        }
    }

    public static void deQueue()
    {
        System.out.print("Output: ");
        do {
            Node node=queue.dequeue();
            if(node==null) break;
            System.out.print(node.key+" ");
        }while (true);
    }

}
