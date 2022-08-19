package testbob;

public class TotalDigitsOfNumber {
    public static int totalDigitsOfNumber(int n) {
        int total = 0;
        // code here
        do {
            total = total + n % 10;
            n = n / 10;
        } while (n > 0);
        return total;
    }
}
