package ss3_Arr_vs_Method.Bai_Tap;

import java.util.Scanner;

public class bt06_Sum_Column {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào số hàng của mảng: ");
        int n = scanner.nextInt();
        System.out.print("Mời bạn nhập vào số cột của mảng: ");
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        enter(arr, n, m);
        sum(arr, n, m);

    }

    public static void enter(int[][] arr, int n, int m) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập váo số phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Arr[ " + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sum(int[][] arr, int n, int m) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cột bạn muốn tính tổng: ");
        int a = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == a){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Tổng của cột: " + a + " là: " + sum);
    }
}
