package com.example.casestudy_ss1.model.contract;

import javax.persistence.*;

@Entity
@Table(name = "contract_detail")
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contractDetailId;
    private int quantity;

    public ContractDetail() {
    }

    public ContractDetail(Integer contractDetailId, int quantity, AttachService attachService, Contract contract) {
        this.contractDetailId = contractDetailId;
        this.quantity = quantity;
        this.attachService = attachService;
        this.contract = contract;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @ManyToOne(targetEntity = AttachService.class, cascade = CascadeType.REMOVE)
    private AttachService attachService;

    @ManyToOne(targetEntity = Contract.class, cascade = CascadeType.REMOVE)
    private Contract contract;

    public ContractDetail(Integer contract_Detail_Id, int quantity, AttachService attachService) {
        this.contractDetailId = contract_Detail_Id;
        this.quantity = quantity;
        this.attachService = attachService;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }

    public ContractDetail(Integer contract_Detail_Id, int quantity) {
        this.contractDetailId = contract_Detail_Id;
        this.quantity = quantity;
    }

    public Integer getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(Integer contract_Detail_Id) {
        this.contractDetailId = contract_Detail_Id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
