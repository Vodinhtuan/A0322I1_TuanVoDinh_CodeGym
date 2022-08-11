package final_exam.services.impl;

import fake_final_exam.utils.ValidateData;
import final_exam.exception.Validate;
import final_exam.models.TaiKhoanTietKiem;
import final_exam.services.ITaiKhoanTietKiem;
import final_exam.util.DocGhiFileTaiKhoanTietKiem;

import java.util.List;
import java.util.Scanner;

public class TaiKhoanTietKiemService implements ITaiKhoanTietKiem {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH = "src/final_exam/data/taiKhoanTietKiem.csv";
    public static List<TaiKhoanTietKiem> taiKhoanTietKiemList = DocGhiFileTaiKhoanTietKiem.docFileTaiKhoanTietKiem(PATH);
    @Override
    public void them() {
        TaiKhoanTietKiem taiKhoanTietKiem = nhapThongTin();
        taiKhoanTietKiemList.add(taiKhoanTietKiem);
        DocGhiFileTaiKhoanTietKiem.ghiFileTaiKhoanTietKiem(PATH, taiKhoanTietKiemList);
        System.out.println("Thêm tài khoản tiết kiệm thành công");
        System.out.println("Danh sách tài khoản tiết kiệm sau khi thêm mới là:  ");
        hienThi();
    }

    @Override
    public void xoa() {
        boolean kiemTra = false;
        if (taiKhoanTietKiemList.isEmpty()) {
            System.out.println("Danh sách tài khoản tiết kiệm đang trống");
        } else {
            System.out.print("Nhập id tài khoản bạn cần xóa :");
            int idXoa = Integer.parseInt(SCANNER.nextLine());
            for (TaiKhoanTietKiem taiKhoanTietKiem : taiKhoanTietKiemList) {
                if (taiKhoanTietKiem.getIdTaiKhoan() == idXoa) {
                    System.out.println("Bạn có muốn xóa tài khoản có id " + idXoa + " có chủ tài khoản là "
                            + taiKhoanTietKiem.getTenChuTaiKhoan() + " không ?");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    System.out.print("Nhập lựa chọn của bạn :");
                    int luaChon = Integer.parseInt(SCANNER.nextLine());
                    if (luaChon == 1) {
                        taiKhoanTietKiemList.remove(taiKhoanTietKiem);
                        DocGhiFileTaiKhoanTietKiem.ghiFileTaiKhoanTietKiem(PATH, taiKhoanTietKiemList);
                        kiemTra = true;
                        System.out.println("Xóa thành công");
                        System.out.println("Danh sách tài khoản tiết kiệm sau khi xóa");
                        hienThi();
                        break;
                    } else if (luaChon == 2) {
                        kiemTra = true;
                        break;
                    }
                }
            }
            if (!kiemTra) {
                System.out.println("Không tìm thấy tài khoản thanh toán có id là " + idXoa);
            }
        }
    }

    @Override
    public void hienThi() {
        if(taiKhoanTietKiemList.isEmpty()){
            System.out.println("Danh sách tài khoản thanh toán đang trống");
        }else {
            for (TaiKhoanTietKiem taiKhoanTietKiem : taiKhoanTietKiemList) {
                System.out.println(taiKhoanTietKiem);
            }
        }
    }

    @Override
    public void timKiem() {
        boolean kiemTra = false;
        if (taiKhoanTietKiemList.isEmpty()) {
            System.out.println("Danh sách tài khoản thanh toán đang trống");
        } else {
            System.out.print("Nhập id tài khoản bạn muốn tìm kiếm :");
            int idTimKiem = Integer.parseInt(SCANNER.nextLine());
            for (TaiKhoanTietKiem taiKhoanTietKiem : taiKhoanTietKiemList) {
                if(taiKhoanTietKiem.getIdTaiKhoan()==idTimKiem){
                    System.out.println("Tài khoản tiết kiệm có id "+idTimKiem + "là "+taiKhoanTietKiem);
                    kiemTra=true;
                    break;
                }
            }
            if(!kiemTra){
                System.out.println("Không tìm thấy tài khoản có id "+idTimKiem);
            }
        }
    }
    public TaiKhoanTietKiem nhapThongTin() {
        int idTaiKhoan;
        String maTaiKhoan;
        String tenChuTaiKhoan;
        String ngayTaoTaiKhoan;
        double soTienGui;
        String ngayGui;
        double laiSuat;
        int kiHan;

        if(taiKhoanTietKiemList.isEmpty()){
            idTaiKhoan = 1;
        }else {
            idTaiKhoan = taiKhoanTietKiemList.get(taiKhoanTietKiemList.size()-1).getIdTaiKhoan()+1;
        }
        System.out.println("Id tài khoản này là  :"+idTaiKhoan);

        System.out.print("Nhập mã tài khoản tài khoản :");
        maTaiKhoan = SCANNER.nextLine();

        System.out.print("Nhập tên chủ tài khoản :");
        tenChuTaiKhoan = SCANNER.nextLine();

        System.out.print("Nhập ngày tạo tài khoản :");
        ngayTaoTaiKhoan = SCANNER.nextLine();

        System.out.print("Nhập số tiền gửi tiết kiệm :");
        soTienGui = Double.parseDouble(SCANNER.nextLine());

        while (!Validate.validated(soTienGui)){
            System.out.println("Vui lòng nhập lại!!!");
            soTienGui = Double.parseDouble(SCANNER.nextLine());
        }

        System.out.print("Nhập ngày gửi tiết kiệm :");
        ngayGui = SCANNER.nextLine();

        System.out.print("Nhập lãi suất :");
        laiSuat = Double.parseDouble(SCANNER.nextLine());

        System.out.print("Nhập kì hạn gửi :");
        kiHan = Integer.parseInt(SCANNER.nextLine());

        return new TaiKhoanTietKiem(idTaiKhoan, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan, soTienGui, ngayGui,
                laiSuat, kiHan);
    }
}
