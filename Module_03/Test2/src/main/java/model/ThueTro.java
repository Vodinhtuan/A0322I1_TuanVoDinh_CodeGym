package model;

import java.util.Date;

public class ThueTro {
    private int maPhong;
    private String name;
    private int phone;
    private Date ngayThue;
    private String ghiChu;
    private int maThanhToan;

    public ThueTro() {
    }

    public ThueTro(int maPhong, String name, int phone, Date ngayThue, String ghiChu, int maThanhToan) {
        this.maPhong = maPhong;
        this.name = name;
        this.phone = phone;
        this.ngayThue = ngayThue;
        this.ghiChu = ghiChu;
        this.maThanhToan = maThanhToan;
    }

    public ThueTro(String name, int phone, Date ngayThue, String ghiChu, int maThanhToan) {
        this.name = name;
        this.phone = phone;
        this.ngayThue = ngayThue;
        this.ghiChu = ghiChu;
        this.maThanhToan = maThanhToan;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Date getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(Date ngayThue) {
        this.ngayThue = ngayThue;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getMaThanhToan() {
        return maThanhToan;
    }

    public void setMaThanhToan(int maThanhToan) {
        this.maThanhToan = maThanhToan;
    }
}
