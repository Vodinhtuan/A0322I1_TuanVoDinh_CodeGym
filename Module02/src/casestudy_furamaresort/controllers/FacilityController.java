package casestudy_furamaresort.controllers;

import casestudy_furamaresort.models.person_inheritance.Employee;
import casestudy_furamaresort.repository.EmployeeRepositoryIplm;
import casestudy_furamaresort.services.interface_services.EmployeeService;
import casestudy_furamaresort.services.services_implements.EmployeeServiceImpl;

import java.util.List;

public class FacilityController {
    private EmployeeService employeeService = (EmployeeService) new EmployeeServiceImpl();
    private static List<Employee> employeeList = (List<Employee>) new EmployeeRepositoryIplm();
    public void displayAllEmployee(){
    }
}
