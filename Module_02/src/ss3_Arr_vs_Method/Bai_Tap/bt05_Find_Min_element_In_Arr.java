package ss3_Arr_vs_Method.Bai_Tap;

import java.util.Scanner;

public class bt05_Find_Min_element_In_Arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        add(arr,n);
        System.out.println("Giá trị nhở nhất trong mảng là: "+ findMin(arr,n));
    }

    public static void add(int arr[], int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        /*for (int i: arr) {
            System.out.print(i +"\t");
        }*/
    }

    public static int findMin(int[] arr, int n) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

        }
        return min;
    }
}
