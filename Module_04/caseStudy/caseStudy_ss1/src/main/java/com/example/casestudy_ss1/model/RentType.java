package com.example.casestudy_ss1.model;

import javax.persistence.*;

@Entity
@Table(name = "rent_type")
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rentTypeId;
    private String rentTypeName;

    public RentType() {
    }

    public RentType(Integer rent_Type_Id, String rent_Type_Name) {
        this.rentTypeId = rent_Type_Id;
        this.rentTypeName = rent_Type_Name;
    }

    public Integer getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(Integer rent_Type_Id) {
        this.rentTypeId = rent_Type_Id;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rent_Type_Name) {
        this.rentTypeName = rent_Type_Name;
    }
}
