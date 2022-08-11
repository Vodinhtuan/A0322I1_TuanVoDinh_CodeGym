package fake_final_exam.controllers;

import fake_final_exam.services.impl.XeMayImpl;

import java.util.Scanner;

public class XeMayController {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static XeMayImpl xeMay = new XeMayImpl();
    public void menuMayController(){
        do{
            System.out.println("-----  QUẢN LÝ PHƯƠNG TIỆN XE MÁY -----");
            System.out.println("Chọn chức năng:  ");
            System.out.println("1. Thêm mới xe máy.");
            System.out.println("2. Hiển thị xe máy.");
            System.out.println("3. Xóa xe máy.");
            System.out.println("4. Tìm kiếm theo biển kiểm soát.");
            System.out.print("5. thoát");
            int luaChon = Integer.parseInt(SCANNER.nextLine());
            switch (luaChon){
                case 1: {
                    xeMay.themMoi();
                    break;
                }
                case 2: {
                    xeMay.hienThi();
                    break;
                }
                case 3: {
                    xeMay.xoaTheoBks();
                    break;
                }
                case 4: {
                    xeMay.timKiem();
                    break;
                }
                case 5: {
                    System.exit(0);
                }
            }
        }while (true);
    }
}
