package quan_ly_codegym.model;

public class GiangVien extends DoiTuong{
    private String chuyenMon;

    public GiangVien() {
    }

    public GiangVien(int ma, String ten, String ngaySinh, boolean gioiTinh, String chuyenMon) {
        super(ma, ten, ngaySinh, gioiTinh);
        this.chuyenMon = chuyenMon;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    @Override
    public String toString() {
        return "GiangVien " + super.toString() +
                " chuyenMon='" + chuyenMon ;
    }

    @Override
    public String getInfor() {
        return String.format("%d,%s,%s,%");
    }
}
