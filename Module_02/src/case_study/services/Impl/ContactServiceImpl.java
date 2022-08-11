package case_study.services.Impl;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.models.Customer;
import case_study.services.ContactService;

import java.util.*;

public class ContactServiceImpl implements ContactService {
    static List<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {

    }

    @Override
    public void addNew() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for (Booking booking: bookingSet) {
            bookingQueue.add(booking);
        }
        Booking booking = bookingQueue.poll();
        Customer customer = booking.getCustomer();
        System.out.println(" Đang tạo hợp đồng cho Booking có thông tin: " +booking.toString());
        System.out.println(" Đang tạo hợp đồng cho khách hàng có thông tin: " +customer.toString());
        System.out.println("Nhập id hợp đồng: ");
        String id = scanner.nextLine();
        System.out.println("Nhập số tiền trả trước: ");
        String pre = scanner.nextLine();
        System.out.println("Nhập số chi phí: ");
        String pay = scanner.nextLine();
//        Contract contract = new Contract(id, booking, pre, pay, customer);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
