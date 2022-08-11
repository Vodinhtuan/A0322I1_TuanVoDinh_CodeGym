package ss1_Introduction_to_Java.BaiTap;

import java.util.Scanner;

public class bt01_Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello: " + name);
    }
}
