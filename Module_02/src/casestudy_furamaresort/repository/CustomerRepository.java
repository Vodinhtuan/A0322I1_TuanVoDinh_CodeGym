package casestudy_furamaresort.repository;

import casestudy_furamaresort.models.person_inheritance.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
    void addCustomer(Customer customer);
    void updateCustomer( int id,Customer customer);
    void remove(int id);
    Customer findById(int id);
}
