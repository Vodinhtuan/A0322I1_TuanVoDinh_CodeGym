package fake_final_exam.controllers;

import fake_final_exam.services.impl.OtoImpl;

import java.util.Scanner;

public class XeOtoController {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static OtoImpl oto = new OtoImpl();
    public void menuOtoController(){
        do{
            System.out.println("-----  QUẢN LÝ PHƯƠNG TIỆN Ô TÔ -----");
            System.out.println("Chọn chức năng:  ");
            System.out.println("1. Thêm mới ô tô.");
            System.out.println("2. Hiển thị ô tô.");
            System.out.println("3. Xóa ô tô.");
            System.out.println("4. Tìm kiếm theo biển kiểm soát.");
            System.out.print("5. thoát");
            int luaChon = Integer.parseInt(SCANNER.nextLine());
            switch (luaChon){
                case 1: {
                        oto.themMoi();
                    break;
                }
                case 2: {
                        oto.hienThi();
                    break;
                }
                case 3: {
                        oto.xoaTheoBks();
                    break;
                }
                case 4: {
                        oto.timKiem();
                    break;
                }
                case 5: {
                    System.exit(0);
                }
            }
        }while (true);
    }
}
