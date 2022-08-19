package testbob;

public class NumberToString_Dojo {
    public static String[] numToStr(int[] arr){
        String[] newArr = new String[arr.length];
        String str = "Dojo";
        for(int i =0; i<arr.length;i++){
            if(arr[i]<0){
                newArr[i] = str;

            }else {
                newArr[i] = String.valueOf(arr[i]);
            }
            System.out.println(newArr[i]);
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {-1, -3, 2};
        numToStr(arr);

    }
}
