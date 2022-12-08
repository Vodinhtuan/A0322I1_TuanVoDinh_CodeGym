package com.example.casestudy_ss1.model.facitily;

import javax.persistence.*;

@Entity
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serviceId;

    private String serviceName;
    private int serviceArea;
    private double serviceCost;
    private int serviceMaxPeople;

    public Service(int service_Id, String service_Name, int service_Area, double service_Cost, int service_Max_People) {
        this.serviceId = service_Id;
        this.serviceName = service_Name;
        this.serviceArea = service_Area;
        this.serviceCost = service_Cost;
        this.serviceMaxPeople = service_Max_People;
    }

    public Service() {
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int service_Id) {
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
