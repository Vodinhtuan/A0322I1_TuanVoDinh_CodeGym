package testbob;

public class GetEven1000 {
    public static void main(String[] args) {
        System.out.println(sum_even_numbers());
    }
    public static int sum_even_numbers() {
        int sum = 0;
        for(int i = 0;i<=1000;i++){
            if(i%2==0){
                sum = sum +i;
            }
        }
        //Your code here
        return sum;
    }
}
