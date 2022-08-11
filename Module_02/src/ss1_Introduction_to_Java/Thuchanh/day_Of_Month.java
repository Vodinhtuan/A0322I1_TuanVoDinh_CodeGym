package ss1_Introduction_to_Java.Thuchanh;

import java.util.Scanner;

public class day_Of_Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int input = scanner.nextInt();
        String daysInMonth;
        switch (input) {
            case 2:
                daysInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
        }

        if (!daysInMonth.equals("")) System.out.printf("The month '%d' has %s days!", input, daysInMonth);
        else System.out.print("Invalid input!");
    }
}
