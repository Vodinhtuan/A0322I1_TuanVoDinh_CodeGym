package com.example.casestudy_ss1.model;

import javax.persistence.*;

@Entity
@Table(name = "division")
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer divisionId;

    private String divisionName;

    public Division() {
    }

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
