package ss3_Arr_vs_Method.Bai_Tap;

import java.util.Scanner;

public class bt03_Merge_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[5];
        System.out.print("Enter the element of the array01: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        int[] arr2 = new int[3];
        System.out.println("Enter the element of the array02: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }
        int[] arr3 = new int[arr1.length + arr2.length];
        merge(arr1,arr2,arr3);
    }

    public static void merge(int a[], int b[], int c[]) {
         int p = a.length + b.length;
        for (int i = 0; i < p; i++) {
            if (i < a.length) {
                c[i] = a[i];
            } else c[i] = b[i - a.length];
        }
        System.out.println("Array after merging: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + "\t");
        };
    }
}
