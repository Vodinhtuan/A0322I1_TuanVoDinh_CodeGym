package model;

public class ThanhToan {
    private int maThanhToan;
    private String cachThanhToan;

    public ThanhToan() {
    }

    public ThanhToan(int maThanhToan, String cachThanhToan) {
        this.maThanhToan = maThanhToan;
        this.cachThanhToan = cachThanhToan;
    }

    public int getMaThanhToan() {
        return maThanhToan;
    }

    public void setMaThanhToan(int maThanhToan) {
        this.maThanhToan = maThanhToan;
    }

    public String getCachThanhToan() {
        return cachThanhToan;
    }

    public void setCachThanhToan(String cachThanhToan) {
        this.cachThanhToan = cachThanhToan;
    }
}
