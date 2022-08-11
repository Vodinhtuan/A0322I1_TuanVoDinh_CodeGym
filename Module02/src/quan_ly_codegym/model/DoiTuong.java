package quan_ly_codegym.model;

public abstract class DoiTuong {
    private int ma;
    private String ten;
    private String ngaySinh;
    private boolean gioiTinh;

    public DoiTuong() {
    }

    public DoiTuong(int ma, String ten, String ngaySinh, boolean gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "DoiTuong " +
                "ma=" + ma +
                ", ten='" + ten + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh= " + (gioiTinh?"Nữ":"Nam");
    }
    public abstract String getInfor();
}
