package com.example.finaltest.model;

import com.example.finaltest.validator.EXPDateValid;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import java.time.LocalDate;

@Entity
public class KhuyenMai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String tieuDe;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate batDau;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @EXPDateValid
    private LocalDate ketThuc;

    @Min(value = 10000, message = "The number must be greater than 10000 and cannot be blank.")
    private Double mucGiam;

    private String chiTiet;

    public KhuyenMai() {
    }

    public KhuyenMai(Integer id, String tieuDe, LocalDate batDau, LocalDate ketThuc, Double mucGiam, String chiTiet) {
        this.id = id;
        this.tieuDe = tieuDe;
        this.batDau = batDau;
        this.ketThuc = ketThuc;
        this.mucGiam = mucGiam;
        this.chiTiet = chiTiet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public LocalDate getBatDau() {
        return batDau;
    }

    public void setBatDau(LocalDate batDau) {
        this.batDau = batDau;
    }

    public LocalDate getKetThuc() {
        return ketThuc;
    }

    public void setKetThuc(LocalDate ketThuc) {
        this.ketThuc = ketThuc;
    }

    public Double getMucGiam() {
        return mucGiam;
    }

    public void setMucGiam(Double mucGiam) {
        this.mucGiam = mucGiam;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }
}
