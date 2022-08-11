package ss14_sort_algorithm.exercise;

public class Bt01Bt02IllustrationInsertionSortByStep extends Bt02InsertionSort{
    public static void main(String[] args) {
        int[] arr = {1,7,0,9,2,4,5};
        printArr(arr);
        illustrationInsertionSort(arr);
    }
    public static void illustrationInsertionSort(int[] arr){
        int len = arr.length;
        for (int i = 1; i<len; i++){
            // Nhấc quân bài lên:
            int tmp = arr[i];
            System.out.println("Tại vị trí i: " + i + " nhấc lên được số " + tmp);
            int j = i - 1;
            // Tìm ra vị trí chính xác để chèn quân bài vừa nhắc lên:
            while (j>=0 && tmp < arr[j]){
                System.out.println("j là: " + j);
                System.out.println(tmp + "  < " + arr[j]);
                // Dịch chuyển các quân bài lên phía trước
                arr[j + 1] = arr[j];
                j--;
                printArr(arr);
            }
            System.out.println("Chèn vào vị trí: " + (j+1));
            // Chèn quân bài vừa nhấc lên vào vị trí đã tìm (j)
            arr[j+1] = tmp;
        }
        printArr(arr);
    }


}
