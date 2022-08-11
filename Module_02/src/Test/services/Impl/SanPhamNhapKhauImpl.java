package Test.services.Impl;

import Test.modules.NhapKhau;
import Test.services.SanPhamNhapKhau;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SanPhamNhapKhauImpl implements SanPhamNhapKhau {
    private static List<NhapKhau> nhapKhauList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void themMoi() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ma san pham: ");
        int maSP = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ten san pham: ");
        String nameSP = scanner.nextLine();
        System.out.println("Nhap gia ban: ");
        double giaBan = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap so luong: ");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap nha san xuat: ");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("Nhap gia nhap khau: ");
        double giaNhapKhau = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap tinh thanh nhap: ");
        String tinhThanhNhap = scanner.nextLine();
        System.out.println("Nhap thue nhap khau: ");
        double thueNhapKhau = Double.parseDouble(scanner.nextLine());
        NhapKhau nhapKhau = new NhapKhau(id, maSP, nameSP, giaBan, soLuong, nhaSanXuat, giaNhapKhau, tinhThanhNhap, thueNhapKhau);
        nhapKhauList.add(nhapKhau);
    }

    @Override
    public void xoa() {

    }

    @Override
    public void xemDS() {
        for (NhapKhau nhapKhau: nhapKhauList) {
            System.out.println(nhapKhau.toString());
        }
    }

    @Override
    public void timkiem() {

    }
}
