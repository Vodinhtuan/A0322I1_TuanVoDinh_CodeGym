package fake_final_exam.controllers;

import fake_final_exam.services.impl.OtoImpl;
import fake_final_exam.services.impl.XeMayImpl;
import fake_final_exam.services.impl.XeTaiImpl;

import java.util.Scanner;

public class MainController {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static OtoImpl oto = new OtoImpl();
    private static XeMayImpl xeMay = new XeMayImpl();
    private static XeTaiImpl xeTai = new XeTaiImpl();

    public static void menuController(){
        do{
            System.out.println("----- CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG -----");
            System.out.println("Chọn chức năng:  ");
            System.out.println("1. Thêm mới phương tiện.");
            System.out.println("2. Hiển thị phương tiện.");
            System.out.println("3. Xóa phương tiện.");
            System.out.println("4. Tìm kiếm theo biển kiểm soát.");
            System.out.println("5. thoát");
            int luaChon = Integer.parseInt(SCANNER.nextLine());
            switch (luaChon){
                case 1: {
                        themMoi();
                    break;
                }
                case 2: {
                        hienThiPhuongTien();
                    break;
                }
                case 3: {
                        xoaPhuongTien();
                    break;
                }
                case 4: {
                        timPhuongTien();
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
            System.out.println("Chọn phương tiện muốn thêm mới: ");
            System.out.println("1. Thêm mới xe oto.");
            System.out.println("2. Thêm mới xe tải.");
            System.out.println("3. Thêm mới xe máy.");
            System.out.println("4. Back to main menu.");
            int check = Integer.parseInt(SCANNER.nextLine());
            switch (check){
                case 1:{
                    oto.themMoi();
                    break;
                }
                case 2:{

                    break;
                }
                case 3:{
                    xeMay.themMoi();
                    break;
                }
                case 4:{
                        menuController();
                    break;
                }
            }
        }while (true);
    }
    public static void hienThiPhuongTien(){
        do {
            System.out.println("Chọn phương tiện muốn hiển thị: ");
            System.out.println("1. Hiển thị xe oto.");
            System.out.println("2. Hiển thị xe tải.");
            System.out.println("3. Hiển thị xe máy.");
            System.out.println("4. Back to main menu.");
            int check = Integer.parseInt(SCANNER.nextLine());
            switch (check){
                case 1:{
                    oto.hienThi();
                    break;
                }
                case 2:{

                    break;
                }
                case 3:{
                    xeMay.hienThi();
                    break;
                }
                case 4:{
                    menuController();
                    break;
                }
            }
        }while (true);
    }
    public static void xoaPhuongTien(){
        do {
            System.out.println("Chọn phương tiện muốn xoa: ");
            System.out.println("1. Xoa xe oto.");
            System.out.println("2. Xoa mới xe tải.");
            System.out.println("3. Xoa mới xe máy.");
            System.out.println("4. Back to main menu.");
            int check = Integer.parseInt(SCANNER.nextLine());
            switch (check){
                case 1:{
                    oto.xoaTheoBks();
                    break;
                }
                case 2:{

                    break;
                }
                case 3:{
                    xeMay.xoaTheoBks();
                    break;
                }
                case 4:{
                    menuController();
                    break;
                }
            }
        }while (true);
    }
    public static void timPhuongTien(){
        do {
            System.out.println("Chọn phương tiện muốn tìm: ");
            System.out.println("1. Tìm xe oto.");
            System.out.println("2. Tìm mới xe tải.");
            System.out.println("3. Tìm mới xe máy.");
            System.out.println("4. Back to main menu.");
            int check = Integer.parseInt(SCANNER.nextLine());
            switch (check){
                case 1:{
                    oto.timKiem();
                    break;
                }
                case 2:{

                    break;
                }
                case 3:{
                    xeMay.timKiem();
                    break;
                }
                case 4:{
                    menuController();
                    break;
                }
            }
        }while (true);
    }
}
