package com.example.casestudy_ss1.model.contract;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contract_Id;

    private Date contract_Start_Date;
    private Date contract_End_Date;
    private double contract_Deposit;
    private double contract_Total_Money;

    @OneToMany
    @JoinColumn(name = "contract_Id",referencedColumnName = "contract_Detail_Id");
    private Set<ContractDetail> contractDetails;


    public Contract(Integer contract_Id, Date contract_Start_Date, Date contract_End_Date, double contract_Deposit, double contract_Total_Money) {
        this.contract_Id = contract_Id;
        this.contract_Start_Date = contract_Start_Date;
        this.contract_End_Date = contract_End_Date;
        this.contract_Deposit = contract_Deposit;
        this.contract_Total_Money = contract_Total_Money;
    }

    public Contract() {
    }

    public Integer getContract_Id() {
        return contract_Id;
    }

    public void setContract_Id(Integer contract_Id) {
        this.contract_Id = contract_Id;
    }

    public Date getContract_Start_Date() {
        return contract_Start_Date;
    }

    public void setContract_Start_Date(Date contract_Start_Date) {
        this.contract_Start_Date = contract_Start_Date;
    }

    public Date getContract_End_Date() {
        return contract_End_Date;
    }

    public void setContract_End_Date(Date contract_End_Date) {
        this.contract_End_Date = contract_End_Date;
    }

    public double getContract_Deposit() {
        return contract_Deposit;
    }

    public void setContract_Deposit(double contract_Deposit) {
        this.contract_Deposit = contract_Deposit;
    }

    public double getContract_Total_Money() {
        return contract_Total_Money;
    }

    public void setContract_Total_Money(double contract_Total_Money) {
        this.contract_Total_Money = contract_Total_Money;
    }
}
