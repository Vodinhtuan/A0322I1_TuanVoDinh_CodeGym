package casestudy_furamaresort.services.interface_services;

import casestudy_furamaresort.models.person_inheritance.Customer;

import java.util.List;

public interface CustomerService extends Service {
    List<Customer> findAll();
    void addCustomer(Customer customer);
    void updateCustomer(int id, Customer customer);
}
