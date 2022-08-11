package case_study.services.Impl;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Villa;
import case_study.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Map.Entry<Facility,Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service " + element.getKey() + "Số lần đã thuê: " + element.getValue());
        }
    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        System.out.print("Nhập id: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập diện tích: ");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập giá tiền: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số lượng người: ");
        int people = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập kiểu thuê: ");
        String rentType = scanner.nextLine();
        System.out.print("Nhập tiêu chuẩn: ");
        String standard = scanner.nextLine();
        System.out.print("Nhập diện tích hồ bơi: ");
        double areaPool = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số tầng: ");
        int floor = Integer.parseInt(scanner.nextLine());

        Villa villa = new Villa(id, name, area, price, people, rentType, standard, areaPool, floor);
        facilityIntegerMap.put(villa,0);
        System.out.println("Thêm mới villa thành công!");
    }

    @Override
    public void addNewHouse() {
        System.out.print("Nhập id: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập diện tích: ");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập giá tiền: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số lượng người: ");
        int people = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập kiểu thuê: ");
        String rentType = scanner.nextLine();

        House house = new House(id, name, area, price, people, rentType);
        facilityIntegerMap.put(house,0);
        System.out.println("Thêm mới house thành công!");
    }

    @Override
    public void addNewRoom() {

    }
}
