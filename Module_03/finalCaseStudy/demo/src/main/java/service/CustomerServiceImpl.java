package service;

import model.Customer;

import java.sql.SQLException;
import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    @Override
    public void create(Customer customer) throws Exception {

    }

    @Override
    public void update(Customer customer) throws Exception {

    }

    @Override
    public boolean deleteById(String id) throws Exception {
        return false;
    }

    @Override
    public Customer findById(String id) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public List<Customer> findAll() throws SQLException, ClassNotFoundException {

        return null;
    }
}
