package ss1_Introduction_to_Java.Thuchanh;

import java.util.Scanner;

public class operator_Expression {
    public static void main(String[] args) {
        int width;
        int height;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weight: ");
        width = scanner.nextInt();
        System.out.print("Enter the weight: ");
        height = scanner.nextInt();
        int area = width * height;
        System.out.println("Area is: " + area);
    }
}
