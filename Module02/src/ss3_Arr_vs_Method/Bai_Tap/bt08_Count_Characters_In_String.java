package ss3_Arr_vs_Method.Bai_Tap;

import java.util.Scanner;

public class bt08_Count_Characters_In_String {
    public static void main(String[] args) {
        String s;
        char c;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập nội dung vào chuỗi: ");
        s = scanner.nextLine();
        System.out.println("Mời bạn nhập ký tự muốn đếm: ");
        c = scanner.next().charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c){
                count++;
            }
        }
        System.out.println("Số lần xuát hiện của " + c + " là: " + count);
    }
}
