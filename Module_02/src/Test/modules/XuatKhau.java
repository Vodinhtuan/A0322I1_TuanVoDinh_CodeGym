package Test.modules;

public class XuatKhau extends SanPham{
    private double giaXuatKhau;
    private String quocGiaNhapSP;

    public XuatKhau() {
    }

    public XuatKhau(int id, int maSP, String nameSP, double giaBan, int soLuong, String nhaSanXuat, double giaXuatKhau, String quocGiaNhapSP) {
        super(id, maSP, nameSP, giaBan, soLuong, nhaSanXuat);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhapSP = quocGiaNhapSP;
    }

    public double getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(double giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGiaNhapSP() {
        return quocGiaNhapSP;
    }

    public void setQuocGiaNhapSP(String quocGiaNhapSP) {
        this.quocGiaNhapSP = quocGiaNhapSP;
    }

    @Override
    public String toString() {
        return "XuatKhau{" + super.toString() +
                "giaXuatKhau='" + giaXuatKhau + '\'' +
                ", quocGiaNhapSP='" + quocGiaNhapSP + '\'' +
                '}';
    }
}
