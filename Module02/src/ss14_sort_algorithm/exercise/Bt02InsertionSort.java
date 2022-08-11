package ss14_sort_algorithm.exercise;

public class Bt02InsertionSort {
    public static void sort(int[] array){
        System.out.print("Sorted array ");
        for (int i = 1; i<array.length; i++){
            int currentElement = array[i];
            int k = i -1;
            for(;k>= 0 && array[k] > currentElement; k--){
                array[k +1] = array[k];
            }
            array[k + 1] = currentElement;
        }
        printArr(array);
    }
    public static void printArr(int[] arr){
        System.out.println("Your arr is: ");
        for (int i: arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] Arr2 = {1,7,0,9,2,4,5};
        printArr(Arr2);
        sort(Arr2);
    }
}
