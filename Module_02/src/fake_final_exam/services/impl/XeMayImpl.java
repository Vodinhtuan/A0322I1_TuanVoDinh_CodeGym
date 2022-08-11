package fake_final_exam.services.impl;

import fake_final_exam.model.XeMay;
import fake_final_exam.services.IXeMay;
import fake_final_exam.utils.DocGhiFileXeMay;
import fake_final_exam.utils.ValidateData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayImpl implements IXeMay {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH_XEMAY = "src/fake_final_exam/data/xeMay.csv";
    private static List<XeMay> xeMayList = DocGhiFileXeMay.docFileXeMay(PATH_XEMAY);

    @Override
    public void themMoi() {
        XeMay xeMay = nhapThongTin();
        xeMayList.add(xeMay);
        DocGhiFileXeMay.ghiFileXeMay(PATH_XEMAY,xeMayList);
        System.out.println("Đã thêm xe máy thành công! \n Danh sách sau khi thêm là:");
        hienThi();
    }

    @Override
    public void hienThi() {
        if (xeMayList.isEmpty()){
            System.out.println("Danh sách xe máy đang rỗng!!!");
        }else {
            for (XeMay xeMay: xeMayList) {
                System.out.println(xeMay.toString());
            }
        }
    }

    @Override
    public void timKiem() {
        boolean check = false;
        if (xeMayList.isEmpty()){
            System.out.println("Danh sách xe máy đang rỗng!!!");
        }else {
            System.out.println("Nhập biển số xe cần tìm: ");
            String bienSoCanTim = SCANNER.nextLine();
            for (XeMay xeMay: xeMayList) {
                if (xeMay.getBienKiemSoat().equals(bienSoCanTim)){
                    System.out.println("Biển số xe bạn cần tìm là: " + xeMay.toString());
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
        if (xeMayList.isEmpty()){
            System.out.println("Danh sách quản lý xe máy đang trống !!!");
        }else {
            System.out.println("Nhập biển số xe cần xóa:");
            String bienSoCanXoa = SCANNER.nextLine();
            for (XeMay xeMay : xeMayList) {
                if (xeMay.getBienKiemSoat().equals(bienSoCanXoa)) {
                    System.out.println("Bạn muốn xóa xe có biển số là: " + bienSoCanXoa + " không? ");
                    System.out.println("1.Có");
                    System.out.println("2.Không");
                    System.out.print("Nhập lựa chọn của bạn :");
                    int choice = Integer.parseInt(SCANNER.nextLine());
                    if (choice == 1) {
                        xeMayList.remove(xeMay);
                        DocGhiFileXeMay.ghiFileXeMay(PATH_XEMAY, xeMayList);
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
    public XeMay nhapThongTin() {
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
        System.out.println("Nhập công suất: ");
        int congSuat = Integer.parseInt(SCANNER.nextLine());
        return new XeMay(bienKiemSoat, tenHangSanXuat, namSanXuat, tenChuSoHuu, congSuat);
    }
    public void capNhatData(){
        boolean check = false;
        if (xeMayList.isEmpty()){
            System.out.println("Danh sách quản lý xe máy đang trống !!!");
        }else {
            System.out.println("Nhập biển số xe cần sửa:");
            String bienSoCanXoa = SCANNER.nextLine();
            for (XeMay xeMay : xeMayList) {
                if (xeMay.getBienKiemSoat().equals(bienSoCanXoa)) {
                    System.out.println("Bạn muốn sửa thông tin xe có biển số là: " + bienSoCanXoa + " không? ");
                    System.out.println("1.Có");
                    System.out.println("2.Không");
                    System.out.print("Nhập lựa chọn của bạn :");
                    int choice = Integer.parseInt(SCANNER.nextLine());
                    if (choice == 1) {
                        System.out.println("Thông tin bạn muốn sửa là: ");
                        System.out.println("1. Biển số");
                        System.out.println("2. Tên hãng sản xuất");
                        System.out.println("3. Năm sản xuất");
                        System.out.println("4. Chủ sở hữu ");
                        System.out.println("5. Công suất ");
                        int choiceSet = Integer.parseInt(SCANNER.nextLine());
                        if (choiceSet == 1){
                            System.out.println("Nhập biển số mới: ");
                            String bienSoMoi = SCANNER.nextLine();

                        }
                        xeMayList.remove(xeMay);
                        DocGhiFileXeMay.ghiFileXeMay(PATH_XEMAY, xeMayList);
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
}
