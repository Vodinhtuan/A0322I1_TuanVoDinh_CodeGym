package ss15_throw_exception_debug.practice;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.print("Hãy nhập y: ");
        int y = scanner.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calcutate(x,y);
    }
    private void calcutate(int x, int y){
        try{
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x + y = " + b);
            System.out.println("Tích x + y = " + c);
            System.out.println("Thương x + y = " + d);
        }catch (Exception e){
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}
