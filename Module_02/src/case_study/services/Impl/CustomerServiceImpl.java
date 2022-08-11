package case_study.services.Impl;

import case_study.models.Customer;
import case_study.models.Employee;
import case_study.services.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Customer customer: customerList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giới tính: ");
        String sex = scanner.nextLine();
        System.out.print("Nhập idCard: ");
        String idCard = scanner.nextLine();
        System.out.print("Nhập sđt: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập loại khách hàng: ");
        String typeCustomer = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, age, sex, idCard, phoneNumber, email, typeCustomer, address);
        customerList.add(customer);
    }

    @Override
    public void edit() {
        System.out.println("Nhập id bạn muốn xóa: ");

    }

    @Override
    public void delete() {

    }
}
