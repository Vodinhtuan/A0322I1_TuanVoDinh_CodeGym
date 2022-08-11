package casestudy_furamaresort.repository;

import casestudy_furamaresort.models.person_inheritance.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> findAll();
    void addEmployee(Employee employee);
    void updateEmPloyee(Employee employee);
    void remove(int id);
    Employee findById(int id);
}
