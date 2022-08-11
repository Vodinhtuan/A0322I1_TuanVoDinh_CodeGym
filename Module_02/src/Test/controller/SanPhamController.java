package Test.controller;

import Test.services.Impl.SanPhamNhapKhauImpl;
import Test.services.Impl.SanPhamXuatKhauImpl;

import java.util.Scanner;

public class SanPhamController {
    public static void main(String[] args) {
        xuatMenu();
    }

    public static void xuatMenu() {
        boolean check = true;
        while (check) {
            System.out.println("-- CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM --");
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách các sản phẩm");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            System.out.println("Chọn chức năng: ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    themMoi();
                    break;
                }
                case 2: {
                    xoa();
                    break;
                }
                case 3:{
                    xemDanhSachSp();
                    break;
                }
                case 4:{
                    timKiem();
                    break;
                }
                case 5: {
                    System.exit(0);
                }
                default:
                    System.out.println("No choice!");
            }
        }
    }

    public static void themMoi() {
        SanPhamNhapKhauImpl sanPhamNhapKhau = new SanPhamNhapKhauImpl();
        SanPhamXuatKhauImpl sanPhamXuatKhau = new SanPhamXuatKhauImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Thêm mới sản phẩm nhập khẩu");
            System.out.println("2. Thêm mới sản phẩm xuất khẩu");
            System.out.println("3. Return Menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    sanPhamNhapKhau.themMoi();
                    sanPhamNhapKhau.xemDS();
                    break;
                }
                case 2: {
                    sanPhamXuatKhau.themMoi();
                    sanPhamXuatKhau.xemDS();
                    break;
                }
                case 3: {
                    xuatMenu();
                }
            }
        }

    }


    public static void xoa() {

    }

    public static void xemDanhSachSp() {

    }

    public static void timKiem() {

    }

}
