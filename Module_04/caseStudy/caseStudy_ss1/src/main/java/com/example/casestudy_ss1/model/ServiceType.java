package com.example.casestudy_ss1.model;

import javax.persistence.*;

@Entity
@Table(name = "service_type")
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer serviceTypeId;

    private String serviceTypeName;

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
