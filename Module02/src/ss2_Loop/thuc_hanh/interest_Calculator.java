package ss2_Loop.thuc_hanh;

import java.util.Scanner;

public class interest_Calculator {
    public static void main(String[] args) {
        double money = 1.0;     //tiền gửi
        int month = 1;      // thời gian gửi
        double interestRate = 1.0;     //lãi xuất /12
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        money = scanner.nextDouble();
        System.out.print("Enter number of months: ");
        month = scanner.nextInt();
        System.out.print("Enter annual interest rate in percentage: ");
        interestRate = scanner.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money*(interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
