package com.example.casestudy_ss1.model;

import javax.persistence.*;

@Entity
@Table(name = "position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer positionId;
    private String positionName;

    public Position() {
    }

    public Position(Integer position_Id, String position_Name) {
        this.positionId = position_Id;
        this.positionName = position_Name;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer position_Id) {
        this.positionId = position_Id;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String position_Name) {
        this.positionName = position_Name;
    }
}
