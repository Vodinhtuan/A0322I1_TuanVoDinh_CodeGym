package final_exam.controller;

import final_exam.services.impl.TaiKhoanThanhToanService;
import final_exam.services.impl.TaiKhoanTietKiemService;

import java.util.Scanner;

public class MainController {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static TaiKhoanThanhToanService taiKhoanThanhToanService = new TaiKhoanThanhToanService();
    private static TaiKhoanTietKiemService taiKhoanTietKiemService = new TaiKhoanTietKiemService();
    public static void menuController() {
        do {
            System.out.println("------ CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG ------");
            System.out.println("1. Thêm mới  ");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách các tài khoản ngân hàng");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            System.out.println("Chọn chức năng:");
            int luaChon = Integer.parseInt(SCANNER.nextLine());
            switch (luaChon) {
                case 1: {
                    themMoi();
                    break;
                }
                case 2: {
                    xoaTaiKhoan();
                    break;
                }
                case 3: {
                    xemDanhSach();
                    break;
                }
                case 4: {
                    timTaiKhoan();
                    break;
                }
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
    public static void themMoi(){
        do {
            System.out.println("Chọn loại tài khoản muốn thêm mới: ");
            System.out.println("1. Thêm mới tài khoản tiết kiệm.");
            System.out.println("2. Thêm mới tài khoản thanh toán.");
            System.out.println("3. Back to main menu.");
            int check = Integer.parseInt(SCANNER.nextLine());
            switch (check){
                case 1:{
                    taiKhoanTietKiemService.them();
                    break;
                }
                case 2:{
                    taiKhoanThanhToanService.them();
                    break;
                }
                case 3:{
                    menuController();
                    break;
                }
            }
        }while (true);
    }
    public static void xemDanhSach(){
        do {
            System.out.println("Chọn tài khoản muốn hiển thị: ");
            System.out.println("1. Hiển thị tài khoản tiết kiệm.");
            System.out.println("2. Hiển thị tài khoản thanh toán.");
            System.out.println("3. Back to main menu.");
            int check = Integer.parseInt(SCANNER.nextLine());
            switch (check){
                case 1:{
                    taiKhoanTietKiemService.hienThi();
                    break;
                }
                case 2:{
                        taiKhoanThanhToanService.hienThi();
                    break;
                }
                case 3:{
                    menuController();
                    break;
                }
            }
        }while (true);
    }
    public static void xoaTaiKhoan(){
        do {
            System.out.println("Chọn tài khoản muốn xoa: ");
            System.out.println("1. Xoa tài khoản tiết kiệm.");
            System.out.println("2. Xoa tài khoản thanh toán.");
            System.out.println("3. Back to main menu.");
            int check = Integer.parseInt(SCANNER.nextLine());
            switch (check){
                case 1:{
                    taiKhoanTietKiemService.xoa();
                    break;
                }
                case 2:{
                    taiKhoanThanhToanService.xoa();
                    break;
                }
                case 3:{
                    menuController();
                    break;
                }
            }
        }while (true);
    }
    public static void timTaiKhoan(){
        do {
            System.out.println("Chọn tài khoản muốn tìm: ");
            System.out.println("1. Tìm tài khoản tiết kiệm.");
            System.out.println("2. Tìm tài khoản thanh toán.");
            System.out.println("3. Back to main menu.");
            int check = Integer.parseInt(SCANNER.nextLine());
            switch (check){
                case 1:{
                    taiKhoanTietKiemService.timKiem();
                    break;
                }
                case 2:{
                    taiKhoanThanhToanService.timKiem();
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
