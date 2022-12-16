package com.example.casestudy_ss1.model.person;

import com.example.casestudy_ss1.model.Division;
import com.example.casestudy_ss1.model.EducationDegree;
import com.example.casestudy_ss1.model.Position;
import com.example.casestudy_ss1.model.contract.Contract;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;

    private String employeeName;
    private Date employeeBirthday;
    private String employeeAddress;
    private String employeeIdCard;
    private String employeePhone;
    private String employeeEmail;

    public Employee() {
    }

    @OneToMany(mappedBy = "employee", cascade = CascadeType.REMOVE)
    private Set<Contract> contracts;

    @ManyToOne(targetEntity = Position.class, cascade = CascadeType.REMOVE)
    private Position position;

    @ManyToOne(targetEntity = EducationDegree.class, cascade = CascadeType.REMOVE)
    private EducationDegree educationDegree;

    @ManyToOne(targetEntity = Division.class, cascade = CascadeType.REMOVE)
    private Division division;

    public Employee(int employeeId, String employeeName, Date employeeBirthday, String employeeAddress, String employeeIdCard, String employeePhone, String employeeEmail) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBirthday = employeeBirthday;
        this.employeeAddress = employeeAddress;
        this.employeeIdCard = employeeIdCard;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(Date employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }
}
