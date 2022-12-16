package com.example.casestudy_ss1.model;

import com.example.casestudy_ss1.model.person.Customer;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customer_type")
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerTypeId;

    private String customerTypeName;

    @OneToMany(mappedBy = "customer_type", cascade = CascadeType.REMOVE)
    private Set<Customer> customers;

    public CustomerType(Integer customerTypeId, String customerTypeName, Set<Customer> customers) {
        this.customerTypeId = customerTypeId;
        this.customerTypeName = customerTypeName;
        this.customers = customers;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public CustomerType() {
    }

    public CustomerType(Integer customerTypeId, String customerTypeName) {
        this.customerTypeId = customerTypeId;
        this.customerTypeName = customerTypeName;
    }

    public Integer getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Integer customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }
}
