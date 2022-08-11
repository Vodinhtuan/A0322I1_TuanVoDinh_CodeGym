package fake_final_exam.model;

public class XeOto extends PhuongTienAbs{
    private int SoChoNgoi;
    private String kieuXe;

    public XeOto() {
    }

    public XeOto(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        SoChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return SoChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        SoChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "XeOto" + super.toString() +
                ", SoChoNgoi=" + SoChoNgoi +
                ", kieuXe='" + kieuXe ;
    }

    @Override
    public String getInfor() {
        return String.format("%s,%s,%d,%s,%d,%s\n",this.getBienKiemSoat(),this.getTenHangSanXuat(), this.getNamSanXuat(),this.getChuSoHuu(),this.getSoChoNgoi(),this.getKieuXe());
    }
}
