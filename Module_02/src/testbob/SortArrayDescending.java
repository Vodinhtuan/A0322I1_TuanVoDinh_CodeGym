package testbob;

public class SortArrayDescending {
    public static int[] sortDESC(int [] arr) {
        int temp = arr[0];
        // code here
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
