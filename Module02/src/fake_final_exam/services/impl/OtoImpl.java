package fake_final_exam.services.impl;

import fake_final_exam.model.XeOto;
import fake_final_exam.services.IOto;
import fake_final_exam.utils.DocGhiFileOto;
import fake_final_exam.utils.ValidateData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtoImpl implements IOto {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH_OTO = "src/fake_final_exam/data/XeOto.csv";
    public static List<XeOto> xeOtoList = DocGhiFileOto.docFileXeOto(PATH_OTO);

    @Override
    public void themMoi() {
        XeOto xeOto = nhapThongTin();
        xeOtoList.add(xeOto);
        DocGhiFileOto.ghiFileXeOto(PATH_OTO, xeOtoList);
        System.out.println("Đã thêm xe ô tô thành công! \n Danh sách sau khi thêm là: ");
        hienThi();
    }

    @Override
    public void hienThi() {
        if (xeOtoList.isEmpty()) {
            System.out.println("Danh sách quản lý xe ô tô đang trống");
        } else {
            for (XeOto xeOto : xeOtoList) {
                System.out.println(xeOto.toString());
            }
        }
    }

    @Override
    public void timKiem() {
        boolean check = false;
        if (xeOtoList.isEmpty()) {
            System.out.println("Danh sách quản lý xe ô tô đang trống !!!");
        } else {
            System.out.println("Nhập biển số xe cần tìm: ");
            String bienSoCanTim = SCANNER.nextLine();
            for (XeOto xeOto : xeOtoList) {
                if (xeOto.getBienKiemSoat().equals(bienSoCanTim)) {
                    System.out.println("Xe bạn cần tìm là: " + xeOto.toString());
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("Không tìm thấy xe ô tô có biển só là: " + bienSoCanTim);
            }
        }
    }

    @Override
    public void xoaTheoBks() {
        boolean check = false;
        if (xeOtoList.isEmpty()) {
            System.out.println("Danh sách quản lý xe ô tô đang trống !!!");
        } else {
            System.out.println("Nhập biển số xe cần xóa: ");
            String bienSoCanXoa = SCANNER.nextLine();
            for (XeOto xeOto : xeOtoList) {
                if (xeOto.getBienKiemSoat().equals(bienSoCanXoa)) {
                    System.out.println("Bạn muốn xóa xe có biển số là: " + bienSoCanXoa + " không? ");
                    System.out.println("1.Có");
                    System.out.println("2.Không");
                    System.out.print("Nhập lựa chọn của bạn :");
                    int choice = Integer.parseInt(SCANNER.nextLine());
                    if (choice == 1) {
                        xeOtoList.remove(xeOto);
                        DocGhiFileOto.ghiFileXeOto(PATH_OTO, xeOtoList);
                        check = true;
                        System.out.println("Xóa thành công xe có biển só lả: " + bienSoCanXoa);
                        System.out.println("Danh sách xe ô tô sau khi xóa là: ");
                        hienThi();
                        break;
                    } else if (choice == 2) {
                        check = true;
                        break;
                    }
                }
                if (!check){
                    System.out.println("Không tìm thấy xe có biển số " + bienSoCanXoa + " trong file!");
                }
            }
        }
    }

    public XeOto nhapThongTin() {
        System.out.println("Nhập biển kiểm soát: ");
        String bienKiemSoat = SCANNER.nextLine();
        System.out.println("Nhập tên hãng sản xuất: ");
        String tenHangSanXuat = SCANNER.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int namSanXuat = Integer.parseInt(SCANNER.nextLine());
        while (!ValidateData.validate(namSanXuat)) {
            System.out.println("Vui lòng nhập lại!!!");
            namSanXuat = Integer.parseInt(SCANNER.nextLine());
        }
        System.out.println("Nhập tên chủ sở hữu: ");
        String tenChuSoHuu = SCANNER.nextLine();
        System.out.println("Nhập số chô ngồi: ");
        int soChoNgoi = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Nhập kiểu xe: ");
        String kieuXe = SCANNER.nextLine();
        return new XeOto(bienKiemSoat, tenHangSanXuat, namSanXuat, tenChuSoHuu, soChoNgoi, kieuXe);
    }
}
