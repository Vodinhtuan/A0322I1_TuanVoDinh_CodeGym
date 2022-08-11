package Test.modules;

public abstract class SanPham {
    private int id;
    private int maSP;
    private String nameSP;
    private double giaBan;
    private int soLuong;
    private String nhaSanXuat;

    public SanPham() {
    }

    public SanPham(int id, int maSP, String nameSP, double giaBan, int soLuong, String nhaSanXuat) {
        this.id = id;
        this.maSP = maSP;
        this.nameSP = nameSP;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getNameSP() {
        return nameSP;
    }

    public void setNameSP(String nameSP) {
        this.nameSP = nameSP;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", maSP=" + maSP +
                ", nameSP='" + nameSP + '\'' +
                ", giaBan='" + giaBan + '\'' +
                ", soLuong=" + soLuong +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                '}';
    }
}
