package quan_ly_codegym.controller;

import java.util.Scanner;

public class MainController {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void menuController(){
        do{
            System.out.println("----- CHƯƠNG TRÌNH QUẢN LÝ CODEGYM -----");
            System.out.println("Chọn chức năng:  ");
            System.out.println("1. Thêm mới giảng viên hoặc học sinh.");
            System.out.println("2. Hiển thị giảng viên hoặc học sinh.");
            System.out.println("3. Xóa giảng viên hoặc học sinh.");
            System.out.println("4. Tìm kiếm theo id giảng viên hoặc học sinh.");
            System.out.println("5. thoát");
            int luaChon = Integer.parseInt(SCANNER.nextLine());
            switch (luaChon){
                case 1: {
                    themMoi();
                    break;
                }
                case 2: {
                    hienThiDoiTuong();
                    break;
                }
                case 3: {
                    xoaDoiTuong();
                    break;
                }
                case 4: {
                    timDoiTuong();
                    break;
                }
                case 5: {
                    System.exit(0);
                }
            }
        }while (true);
    }
    public static void themMoi(){
        do {
            System.out.println("Chọn đối tượng muốn thêm mới: ");
            System.out.println("1. Thêm mới giảng viên.");
            System.out.println("2. Thêm mới học sinh.");
            System.out.println("4. Back to main menu.");
            int check = Integer.parseInt(SCANNER.nextLine());
            switch (check){
                case 1:{
                    break;
                }
                case 2:{

                    break;
                }
                case 3:{
                    menuController();
                    break;
                }
            }
        }while (true);
    }
    public static void hienThiDoiTuong(){
        do {
            System.out.println("Chọn danh sách muốn hiển thị: ");
            System.out.println("1. Hiển thị giảng viên.");
            System.out.println("2. Hiển thị học viên.");
            System.out.println("4. Back to main menu.");
            int check = Integer.parseInt(SCANNER.nextLine());
            switch (check){
                case 1:{

                    break;
                }
                case 2:{

                    break;
                }
                case 3:{
                    menuController();
                    break;
                }
            }
        }while (true);
    }
    public static void xoaDoiTuong(){
        do {
            System.out.println("Chọn đối tượng muốn xoa: ");
            System.out.println("1. Xoa giảng viên.");
            System.out.println("2. Xoa học viên.");
            System.out.println("4. Back to main menu.");
            int check = Integer.parseInt(SCANNER.nextLine());
            switch (check){
                case 1:{

                    break;
                }
                case 2:{

                    break;
                }
                case 3:{
                    menuController();
                    break;
                }
            }
        }while (true);
    }
    public static void timDoiTuong(){
        do {
            System.out.println("Chọn đối tượng muốn tìm: ");
            System.out.println("1. Tìm giảng viên.");
            System.out.println("2. Tìm học viên.");
            System.out.println("4. Back to main menu.");
            int check = Integer.parseInt(SCANNER.nextLine());
            switch (check){
                case 1:{

                    break;
                }
                case 2:{

                    break;
                }
                case 3:{
                    menuController();
                    break;
                }
            }
        }while (true);
    }
}

