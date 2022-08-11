package ss3_Arr_vs_Method.Bai_Tap;

import java.util.Scanner;

public class bt02_push_arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        nhap(arr,10);
        System.out.print("Nhập vị trí cần thêm: ");
        int number_push = scanner.nextInt();
        System.out.print("Nhập giá trị cần chèn: ");
        int value = scanner.nextInt();
        viTri(arr, number_push, value);
        System.out.println("Mảng sau khi thêm là: ");
        themPt(arr);

    }
    public static void viTri(int[] arr, int index, int x) {
        for (int i = arr.length-1 ; i > index; i--) {

            arr[i] = arr[i - 1];
        }
        arr[index] = x;

    }

    public static void themPt(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print( arr[i] + "\t ");
        }

    }
    public static void nhap(int arr[],int n){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số lượng phần tử: ");
         n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + " ");
            arr[i] = scanner.nextInt();
        }
    }


}
