package ss2_Loop.bai_tap;

import java.util.Scanner;

public class bt01_Show_Figure {
    public static void main(String[] args) {
        int weight = 0;  //a
        int height = 0;  //b
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle.");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Print the rectangle.");
                    System.out.print("Enter the weight: ");
                    weight = input.nextInt();
                    System.out.print("Enter the height: ");
                    height = input.nextInt();
                    for (int i = 1; i <=height ; i++) {
                        for (int j = 1; j <=weight ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("2. Print the square triangle");
                    System.out.print("Enter the height: ");
                    height = input.nextInt();
                    for (int i = 1; i <=height ; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("3. Print isosceles triangle");
                    for(int i=7;i>=1;i--) {
                        for (int j = 1; j <= i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}

