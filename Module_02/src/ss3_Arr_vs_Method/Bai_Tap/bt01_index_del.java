package ss3_Arr_vs_Method.Bai_Tap;

import java.util.Scanner;

public class bt01_index_del {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        Scanner scanner =new Scanner(System.in);
        System.out.print("Nhập số cần xóa: ");
        int number_delete = scanner.nextInt();
        int location_delete = find_Index(arr, number_delete);
        if (location_delete == -1){
            System.out.println("Element does not exist");
        }else {
            arr = del_Index(arr,location_delete);
        }
        System.out.println("Mảng sau khi xóa là ");
        for (int i = 0;i <arr.length ; i++){
            System.out.print(arr[i] + "\t");
        }
    }
    public static int find_Index(int[] arr, int x){
        int index =-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                index = i;
                break;
            }
        }
        return index;
    }
    public static int[] del_Index(int[] arr, int index){
        int[] newarr = new int[arr.length-1];
        for (int i =0; i<index;i++){
            newarr[i] = arr[i];
        }
        for (int i = index+1; i < newarr.length ; i++) {
            newarr[i-1] = arr[i];
        }
        return newarr;

    }
}


















 /*int[] arr = {4, 12, 7, 8, 1, 6, 9};
        Scanner scanner =new Scanner(System.in);
        int number_delete = scanner.nextInt();
        int location_delete = find_Index(arr, number_delete);
        if (location_delete == -1){
            System.out.println("Element does not exist");
        }else {
            arr = del_Index(arr,location_delete);
        }
        for (int i = 0;i <arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static int find_Index(int[] arr, int x){
        int index =-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                index = i;
                break;
            }
        }
        return index;
    }
    public static int[] del_Index(int[] arr, int index){
        int[] newarr = new int[arr.length-1];
        for (int i =0; i<index;i++){
            newarr[i] = arr[i];
        }
        for (int i = index+1; i < newarr.length ; i++) {
            newarr[i-1] = arr[i];
        }
        return newarr; */