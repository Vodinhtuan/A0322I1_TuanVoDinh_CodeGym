package com.example.casestudy_ss1.model.contract;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "attach_service")
public class AttachService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer attachServiceId;

    private String attachServiceName;

    private double attachServiceCost;

    private int attachServiceUnit;

    private String attachServiceStatus;

    @OneToMany(mappedBy = "attach_service",cascade = CascadeType.REMOVE)
    private Set<ContractDetail> contractDetails;

    public AttachService(Integer attachServiceId, String attachServiceName, double attachServiceCost, int attachServiceUnit, String attachServiceStatus, Set<ContractDetail> contractDetails) {
        this.attachServiceId = attachServiceId;
        this.attachServiceName = attachServiceName;
        this.attachServiceCost = attachServiceCost;
        this.attachServiceUnit = attachServiceUnit;
        this.attachServiceStatus = attachServiceStatus;
        this.contractDetails = contractDetails;
    }

    public Set<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(Set<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }

    public AttachService() {
    }

    public AttachService(Integer attach_Service_Id, String attach_Service_Name, double attach_Service_Cost, int attach_Service_Unit, String attach_Service_Status) {
        this.attachServiceId = attach_Service_Id;
        this.attachServiceName = attach_Service_Name;
        this.attachServiceCost = attach_Service_Cost;
        this.attachServiceUnit = attach_Service_Unit;
        this.attachServiceStatus = attach_Service_Status;
    }

    public Integer getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(Integer attach_Service_Id) {
        this.attachServiceId = attach_Service_Id;
    }

    public String getAttachServiceName() {
        return attachServiceName;
    }

    public void setAttachServiceName(String attach_Service_Name) {
        this.attachServiceName = attach_Service_Name;
    }

    public double getAttachServiceCost() {
        return attachServiceCost;
    }

    public void setAttachServiceCost(double attach_Service_Cost) {
        this.attachServiceCost = attach_Service_Cost;
    }

    public int getAttachServiceUnit() {
        return attachServiceUnit;
    }

    public void setAttachServiceUnit(int attach_Service_Unit) {
        this.attachServiceUnit = attach_Service_Unit;
    }

    public String getAttachServiceStatus() {
        return attachServiceStatus;
    }

    public void setAttachServiceStatus(String attach_Service_Status) {
        this.attachServiceStatus = attach_Service_Status;
    }
}
