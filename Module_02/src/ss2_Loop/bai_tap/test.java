package ss2_Loop.bai_tap;

public class test {
    public static void main(String[] args) {
        int height = 5;
        int weight = 5;
        for (int i = 1; i <=height ; i++) {
            for (int j = 1; j <=weight ; ) {
                System.out.print("*");
                j+=j;
            }
            System.out.println();
        }
    }
}
