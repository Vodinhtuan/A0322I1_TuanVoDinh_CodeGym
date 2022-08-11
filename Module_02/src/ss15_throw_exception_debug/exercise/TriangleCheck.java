package ss15_throw_exception_debug.exercise;

import java.util.Scanner;

public class TriangleCheck {
    private void check(int a, int b, int c) throws IllegalTriangleException {
        if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("Not a triangle");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a ");
        int a = sc.nextInt();
        System.out.print("Nhap b ");
        int b = sc.nextInt();
        System.out.print("Nhap c ");
        int c = sc.nextInt();

        TriangleCheck kc = new TriangleCheck();
        try {
            kc.check(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getErrorMessage());
        }
    }

}
