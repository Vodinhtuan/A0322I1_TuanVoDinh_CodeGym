package case_study.controller;

import case_study.models.Booking;
import case_study.services.Impl.BookingServiceImpl;
import case_study.services.Impl.CustomerServiceImpl;
import case_study.services.Impl.EmployeeServiceImpl;
import case_study.services.Impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu(){
        boolean check = true;
        while(check){
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:{
                    displayEmployMenu();
                    break;
                }
                case 2:{
                    displayCustomersMenu();
                    break;
                }
                case 3:{
                    displayFacilityMenu();
                    break;
                }
                case 4:{
                    displayBookingMenu();
                    break;
                }
                case 5:{
                   displayPromotionMenu();
                   break;
                }
                case 6:{
                    System.exit(0);
                }
                default:
                    System.out.println("No choice!");
            }
        }
    }
    public static void displayEmployMenu(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean check = true;
        while(check){
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:{
                    employeeService.display();
                    break;
                }
                case 2:{
                    employeeService.addNew();
                    break;
                }
                case 3:{

                }
                case 4:{
                     displayMainMenu();
                     break;
                }
            }
        }
    }
    public static void displayCustomersMenu(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        while(check){
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:{
                    customerService.display();
                    break;
                }
                case 2:{
                    customerService.addNew();
                    break;
                }
                case 3:{

                }
                case 4:{
                    displayMainMenu();
                    break;
                }
            }
        }
    }
    public static void displayFacilityMenu(){
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while(check){
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:{
                    facilityService.display();
                    break;
                }
                case 2:{
                    addNewFacilityMenu();
                    break;
                }
                case 3:{
                    facilityService.displayMaintain();
                    break;
                }
                case 4:{
                    displayMainMenu();
                    break;
                }
            }
        }
    }
    public static void addNewFacilityMenu(){
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while(check){
            System.out.println("1. Add new Villa");
            System.out.println("2. Add new House");
            System.out.println("3. Add new Room");
            System.out.println("4. Return FacilityMenu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:{
                    facilityService.addNewVilla();
                    displayFacilityMenu();
                    break;
                }
                case 2:{
                    facilityService.addNewHouse();
                    displayFacilityMenu();
                    break;
                }
                case 3:{
                    facilityService.addNewRoom();
                    displayFacilityMenu();
                    break;
                }
                case 4:{
                    displayFacilityMenu();
                    break;
                }
            }
        }
    }
    public static void displayBookingMenu(){
        BookingServiceImpl bookingService = new BookingServiceImpl();
        boolean check = true;
        while(check){
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new constracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:{
                    bookingService.addBooking();
                    break;
                }
                case 2:{
                    bookingService.displayListBooking();
                }
                case 3:{

                }
                case 4:{

                }
                case 5:{

                }
                case 6:{
                    displayMainMenu();
                    break;
                }
            }
        }
    }
    public static void displayPromotionMenu(){
        boolean check = true;
        while(check){
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:{

                }
            }
        }
    }
}
