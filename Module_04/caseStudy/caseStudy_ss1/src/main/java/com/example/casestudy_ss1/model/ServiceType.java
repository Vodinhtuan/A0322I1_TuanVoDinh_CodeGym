package com.example.casestudy_ss1.model;

import com.example.casestudy_ss1.model.facitily.Service;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "service_type")
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer serviceTypeId;

    private String serviceTypeName;

    @OneToMany(mappedBy = "service_type", cascade = CascadeType.REMOVE)
    private Set<Service> services;

    public ServiceType(Integer serviceTypeId, String serviceTypeName, Set<Service> services) {
        this.serviceTypeId = serviceTypeId;
        this.serviceTypeName = serviceTypeName;
        this.services = services;
    }

    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        this.services = services;
    }

    public ServiceType() {
    }

    public ServiceType(Integer service_Type_Id, String service_Type_Name) {
        this.serviceTypeId = service_Type_Id;
        this.serviceTypeName = service_Type_Name;
    }

    public Integer getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(Integer service_Type_Id) {
        this.serviceTypeId = service_Type_Id;
    }

    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String service_Type_Name) {
        this.serviceTypeName = service_Type_Name;
    }
}
