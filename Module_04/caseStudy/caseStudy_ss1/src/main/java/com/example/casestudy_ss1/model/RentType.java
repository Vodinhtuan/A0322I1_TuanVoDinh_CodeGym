package com.example.casestudy_ss1.model;

import com.example.casestudy_ss1.model.facitily.Service;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "rent_type")
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rentTypeId;
    private String rentTypeName;

    @OneToMany(mappedBy = "rent_type", cascade = CascadeType.REMOVE)
    private Set<Service> services;

    public RentType() {
    }

    public RentType(Integer rentTypeId, String rentTypeName, Set<Service> services) {
        this.rentTypeId = rentTypeId;
        this.rentTypeName = rentTypeName;
        this.services = services;
    }

    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        this.services = services;
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
