package casestudy_furamaresort.services.services_implements;

import casestudy_furamaresort.models.person_inheritance.Customer;
import casestudy_furamaresort.repository.CustomerRepository;
import casestudy_furamaresort.repository.CustomerRepositoryIplm;
import casestudy_furamaresort.services.interface_services.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository repository = new CustomerRepositoryIplm();
    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public void addCustomer(Customer customer) {
        repository.addCustomer(customer);
    }

    @Override
    public void updateCustomer(int id, Customer customer) {
        repository.updateCustomer(id,customer);
    }
}
