package ss3_Arr_vs_Method.Bai_Tap;

import java.util.Scanner;

public class bt04_Find_the_largest_element_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số dòng: ");
        int n = scanner.nextInt();
        System.out.print("Nhập vào số cột: ");
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        enter(arr, n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Giá trị lớn nhất của mảng 2 chiều là: " + findMax(arr, n, m));

    }

    public static void enter(int[][] arr, int n, int m) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Arr[ " + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public static int findMax(int[][] arr, int n, int m) {
        int max = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
