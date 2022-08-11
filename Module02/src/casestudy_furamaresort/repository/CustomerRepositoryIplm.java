package casestudy_furamaresort.repository;

import casestudy_furamaresort.models.person_inheritance.Customer;

import java.util.LinkedList;
import java.util.List;

public class CustomerRepositoryIplm implements CustomerRepository{
    private static List<Customer> customersList;
    static {
        customersList = new LinkedList<>();
        customersList.add(new Customer(1,"Tuan","24/05/2002","Male",1907,547704,"dinhtuan@gmail.com","Diamond","HaTinh"));
        customersList.add(new Customer(2,"Hien","07/09/2001","Female",1995,557166,"phanhai@gmail.com","silver","QuangBinh"));
        customersList.add(new Customer(3,"Trung","04/03/2003","Male",1985,253051,"trungho@gmail.com","gold","QuangTri"));
        customersList.add(new Customer(4,"Nhi","17/09/2005","Female",1907,192060,"nhiduong@gmail.com","Member","Hue"));
        customersList.add(new Customer(5,"Thanh","08/04/2002","Male",1405,678522,"thanhdang@gmail.com","Platinium","Laos"));
    }
    @Override
    public List<Customer> findAll() {
        return customersList;
    }

    @Override
    public void addCustomer(Customer customer) {
        customersList.add(customer);
    }


    @Override
    public void updateCustomer(int id,Customer customer) {
        customersList.set(customer.getId(),customer);
    }

    @Override
    public void remove(int id) {
        customersList.remove(id);
    }

    @Override
    public Customer findById(int id) {
        return customersList.get(id);
    }
}
