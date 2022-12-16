package com.example.casestudy_ss1.model;

import com.example.casestudy_ss1.model.person.Employee;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "division")
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer divisionId;

    private String divisionName;

    public Division() {
    }
    @OneToMany(mappedBy = "division", cascade = CascadeType.REMOVE)
    private Set<Employee> employees;

    public Division(Integer division_Id, String division_Name) {
        this.divisionId = division_Id;
        this.divisionName = division_Name;
    }

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer division_Id) {
        this.divisionId = division_Id;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String division_Name) {
        this.divisionName = division_Name;
    }
}
