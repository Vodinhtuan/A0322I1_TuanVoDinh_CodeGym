package ss2_Loop.bai_tap;

public class bt02_20_Prime_Number {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            int dem = 0;
            for (int j = 1; j <=i ; j++) {
                if (i%j==0){
                    dem ++;
                }
            }if (dem==2){
                System.out.print(" " + i);
            }
        }

    }
}
