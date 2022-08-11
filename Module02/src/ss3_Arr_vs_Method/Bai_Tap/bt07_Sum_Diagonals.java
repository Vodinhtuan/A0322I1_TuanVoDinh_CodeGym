package ss3_Arr_vs_Method.Bai_Tap;

import java.util.Scanner;

public class bt07_Sum_Diagonals {
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i==j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.print("Tổng đường chéo chính là: " + sum);
    }
}
/*int[][] matrix = {
                {1, 2, 3, 0},
                {4, 5, 6, 9},
                {7, 2, 5, 5}
        };
        //vòng lặp for-each đầu tiên truy cập đến mảng 1 chiều chứa các dòng
        for (int[] innerArray: matrix) {
            //vòng lặp for-each truy cập đến từng phần tử trong các dòng
            for(int data: innerArray) {
                System.out.print(data + " ");
            }
            System.out.println();
        } */