package Test.services.Impl;

import Test.modules.NhapKhau;
import Test.modules.XuatKhau;
import Test.services.SanPhamXuatKhau;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SanPhamXuatKhauImpl implements SanPhamXuatKhau {
    private static List<XuatKhau> xuatKhauList = new ArrayList<>();
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

        System.out.println("Nhap gia xuat khau: ");
        double giaXuatKhau = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap quoc gia nhap san pham: ");
        String quocGia = scanner.nextLine();
        XuatKhau xuatKhau = new XuatKhau(id, maSP, nameSP, giaBan, soLuong, nhaSanXuat, giaXuatKhau, quocGia);
        xuatKhauList.add(xuatKhau);
    }

    @Override
    public void xoa() {

    }

    @Override
    public void xemDS() {
        for (XuatKhau xuatKhau: xuatKhauList) {
            System.out.println(xuatKhau.toString());
        }
    }

    @Override
    public void timkiem() {

    }
}
