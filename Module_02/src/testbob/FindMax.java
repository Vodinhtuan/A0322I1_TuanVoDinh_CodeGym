package testbob;

public class FindMax {
    public static int findMax(int[] arr) {
        int max = arr[0];
        // code here
        for(int i =0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
