package com.example.casestudy_ss1.model.facitily;

import com.example.casestudy_ss1.model.RentType;
import com.example.casestudy_ss1.model.ServiceType;
import com.example.casestudy_ss1.model.contract.Contract;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer serviceId;

    private String serviceName;
    private int serviceArea;
    private double serviceCost;
    private int serviceMaxPeople;

    @ManyToOne(targetEntity = RentType.class, cascade = CascadeType.REMOVE)
    private RentType rentType;

    @OneToMany(mappedBy = "service", cascade = CascadeType.REMOVE)
    private Set<Contract> contracts;

    @ManyToOne(targetEntity = ServiceType.class, cascade = CascadeType.REMOVE)
    private ServiceType serviceType;

    public Service(Integer serviceId, String serviceName, int serviceArea, double serviceCost, int serviceMaxPeople, RentType rentType, Set<Contract> contracts, ServiceType serviceType) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.rentType = rentType;
        this.contracts = contracts;
        this.serviceType = serviceType;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public Service(int service_Id, String service_Name, int service_Area, double service_Cost, int service_Max_People) {
        this.serviceId = service_Id;
        this.serviceName = service_Name;
        this.serviceArea = service_Area;
        this.serviceCost = service_Cost;
        this.serviceMaxPeople = service_Max_People;
    }

    public Service() {
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer service_Id) {
        this.serviceId = service_Id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String service_Name) {
        this.serviceName = service_Name;
    }

    public int getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(int service_Area) {
        this.serviceArea = service_Area;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double service_Cost) {
        this.serviceCost = service_Cost;
    }

    public int getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(int service_Max_People) {
        this.serviceMaxPeople = service_Max_People;
    }
}
