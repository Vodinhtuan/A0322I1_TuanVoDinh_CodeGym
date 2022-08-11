package casestudy_furamaresort.repository;

import casestudy_furamaresort.models.person_inheritance.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryIplm implements EmployeeRepository{
    private static List<Employee> employeeList;
    static {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Tom","11/05/1981","Male",0001,125463963,"tomcruise@gmail.com","intermediate","receptionist",800));
        employeeList.add(new Employee(2,"Tony","27/09/1985","Male",0002,789512398,"tonykillers@gmail.com","college","servants",750));
        employeeList.add(new Employee(3,"John","21/02/1987","Male",4567,753159987,"johnnydepp@gmail.com","university","expert",321));
        employeeList.add(new Employee(4,"Anna","08/06/1975","Female",1334,026753321,"annabelle@gmail.com","university","supervisor",985));
        employeeList.add(new Employee(5,"Kim","15/01/2001","Female",6780,369852741,"kimpoor@gmail.com","afterUniversity","manager",200));
        employeeList.add(new Employee(5,"michael","05/11/1991","Male",1410,912367001,"michaelbuble@gmail.com","afterUniversity","director",2000));
    }
    @Override
    public List<Employee> findAll() {
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void updateEmPloyee(Employee employee) {
        employeeList.set(employee.getId(),employee );
    }

    @Override
    public void remove(int id) {
        employeeList.remove(id);
    }

    @Override
    public Employee findById(int id) {
        return employeeList.get(id);
    }
}
