package ss1_Introduction_to_Java.BaiTap;

import java.util.Scanner;

public class bt03_Usd_Vnd {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền USD:");
        usd = scanner.nextDouble();
        double quydoi = usd *23000;
        System.out.println("Giá trị VND: " + quydoi);
    }
}
