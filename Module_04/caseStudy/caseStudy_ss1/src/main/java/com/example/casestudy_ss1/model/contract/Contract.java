package com.example.casestudy_ss1.model.contract;

import com.example.casestudy_ss1.model.facitily.Service;
import com.example.casestudy_ss1.model.person.Customer;
import com.example.casestudy_ss1.model.person.Employee;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contractId;

    private Date contractStartDate;
    private Date contractEndDate;
    private double contractDeposit;
    private double contractTotalMoney;

    @OneToMany(mappedBy = "contract", cascade = CascadeType.REMOVE)
    private Set<ContractDetail> contractDetails;

    @ManyToOne(targetEntity = Service.class, cascade = CascadeType.REMOVE)
    private Service service;

    @ManyToOne(targetEntity = Customer.class, cascade = CascadeType.REMOVE)
    private Customer customer;

    @ManyToOne(targetEntity = Employee.class, cascade = CascadeType.REMOVE)
    private Employee employee;

    public Contract(Integer contractId, Date contractStartDate, Date contractEndDate, double contractDeposit, double contractTotalMoney, Set<ContractDetail> contractDetails, Service service, Customer customer, Employee employee) {
        this.contractId = contractId;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.contractDeposit = contractDeposit;
        this.contractTotalMoney = contractTotalMoney;
        this.contractDetails = contractDetails;
        this.service = service;
        this.customer = customer;
        this.employee = employee;
    }

    public Set<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(Set<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Contract(Integer contract_Id, Date contract_Start_Date, Date contract_End_Date, double contract_Deposit, double contract_Total_Money) {
        this.contractId = contract_Id;
        this.contractStartDate = contract_Start_Date;
        this.contractEndDate = contract_End_Date;
        this.contractDeposit = contract_Deposit;
        this.contractTotalMoney = contract_Total_Money;
    }

    public Contract() {
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contract_Id) {
        this.contractId = contract_Id;
    }

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Date contract_Start_Date) {
        this.contractStartDate = contract_Start_Date;
    }

    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Date contract_End_Date) {
        this.contractEndDate = contract_End_Date;
    }

    public double getContractDeposit() {
        return contractDeposit;
    }

    public void setContractDeposit(double contract_Deposit) {
        this.contractDeposit = contract_Deposit;
    }

    public double getContractTotalMoney() {
        return contractTotalMoney;
    }

    public void setContractTotalMoney(double contract_Total_Money) {
        this.contractTotalMoney = contract_Total_Money;
    }
}
