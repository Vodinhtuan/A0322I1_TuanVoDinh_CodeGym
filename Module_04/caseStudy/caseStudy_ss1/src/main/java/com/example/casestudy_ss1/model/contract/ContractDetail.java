package com.example.casestudy_ss1.model.contract;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "contract_detail")
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contract_Detail_Id;
    private int quantity;

    public ContractDetail() {
    }


    @ManyToOne
    @JoinColumn(name = "contract_Detail_Id", referencedColumnName = "attach_Service_Id")
    private AttachService attachServices;

    @ManyToOne(mappedBy = contract, cascade = CascadeType.REMOVE)
    private Contract contract;

    public ContractDetail(Integer contract_Detail_Id, int quantity, AttachService attachServices) {
        this.contract_Detail_Id = contract_Detail_Id;
        this.quantity = quantity;
        this.attachServices = attachServices;
    }

    public AttachService getAttachServices() {
        return attachServices;
    }

    public void setAttachServices(AttachService attachServices) {
        this.attachServices = attachServices;
    }

    public ContractDetail(Integer contract_Detail_Id, int quantity) {
        this.contract_Detail_Id = contract_Detail_Id;
        this.quantity = quantity;
    }

    public Integer getContract_Detail_Id() {
        return contract_Detail_Id;
    }

    public void setContract_Detail_Id(Integer contract_Detail_Id) {
        this.contract_Detail_Id = contract_Detail_Id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
