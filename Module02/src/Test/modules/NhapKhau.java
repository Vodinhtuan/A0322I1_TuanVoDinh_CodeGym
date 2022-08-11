package Test.modules;

public class NhapKhau extends SanPham{
    private double giaNhapKhau;
    private String tinhThanhNhap;
    private double thueNhapKhau;

    public NhapKhau() {
    }

    public NhapKhau(int id, int maSP, String nameSP, double giaBan, int soLuong, String nhaSanXuat, double giaNhapKhau, String tinhThanhNhap, double thueNhapKhau) {
        super(id, maSP, nameSP, giaBan, soLuong, nhaSanXuat);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhap = tinhThanhNhap;
        this.thueNhapKhau = thueNhapKhau;
    }

    public double getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(int giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhThanhNhap() {
        return tinhThanhNhap;
    }

    public void setTinhThanhNhap(String tinhThanhNhap) {
        this.tinhThanhNhap = tinhThanhNhap;
    }

    public double getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(int thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public String toString() {
        return "NhapKhau{" + super.toString() +
                "giaNhapKhau=" + giaNhapKhau +
                ", tinhThanhNhap=" + tinhThanhNhap +
                ", thueNhapKhau=" + thueNhapKhau +
                '}';
    }
}
