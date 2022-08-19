package testbob;

public class MaxMinAvg {
    public static void main(String[] args) {
        int [] arr = {1,5,10, -2};
        maxMinAvg(arr);
    }
    public static int[] maxMinAvg(int[] arr) {
        int[] arrnew = new int[3];
        int  max = 0;
        int  min = 0;
        int  sum = 0;
        int  avg = 0;
        // code here
        for(int i =0;i<arr.length;i++){
            max = arr[i];
            min = arr[i];
            if(arr[i]>max){
                max = arr[i];
            }else if(arr[i]<min){
                min = arr[i];
            }
            sum+=arr[i];
        }
        avg = sum/arr.length;
        arrnew[0] = max;
        arrnew[1] = min;
        arrnew[2] = avg;
        return arrnew;
    }
}
