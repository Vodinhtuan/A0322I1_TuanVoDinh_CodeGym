package casestudy_furamaresort.services.interface_services;

import casestudy_furamaresort.models.person_inheritance.Employee;

import java.util.List;

public interface EmployeeService extends Service {
    Employee getEmployee(int index);
    void employeeShow();
    int sizeListEmployee();
    void displayAll();
    void addEmployee(Employee employee);
    void editEmployee(int index, Employee employee);
    void editEmployee(int id, int idCard, int phoneNumber, String name, String birthDay, String gender, String email, String level, String workLocation, double salary);
}

