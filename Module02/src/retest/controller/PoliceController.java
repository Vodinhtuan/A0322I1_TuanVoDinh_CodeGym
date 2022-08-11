package retest.controller;

import java.util.Scanner;

public class PoliceController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu(){
        boolean check = true;
        while(check){
            System.out.println("------ CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG ------");
            System.out.println("Chọn chức năng: ");
            System.out.println("1. Thêm mới phương tiện ");
            System.out.println("2. Hiển thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Tìm kiếm theo bảng kiểm soát ");
            System.out.println("5. Exit");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:{

                    break;
                }
                case 2:{

                    break;
                }
                case 3:{

                    break;
                }
                case 4:{

                    break;
                }
                case 5:{
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
