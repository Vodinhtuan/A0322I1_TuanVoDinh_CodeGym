package testbob;

public class Get1To255 {
    public static int[] getArray() {
        int[] arr = new int[255];
        // code here
        int j = 0;
        for(int i=1;i<=255;i++){
            arr[j]=i;
            j++;
        }
        return arr;
    }
    public static void main(String[] args){
        getArray();
    }
}
