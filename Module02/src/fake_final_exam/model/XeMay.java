package fake_final_exam.model;

public class XeMay extends PhuongTienAbs {
    private int congXuat;

    public XeMay() {
    }

    @Override
    public String getInfor() {
        return String.format("%s,%s,%d,%s,%d\n", this.getBienKiemSoat(), this.getTenHangSanXuat(), this.getNamSanXuat(),
                this.getChuSoHuu(), this.getCongXuat());
    }

    public XeMay(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int congXuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congXuat = congXuat;
    }

    public int getCongXuat() {
        return congXuat;
    }

    public void setCongXuat(int congXuat) {
        this.congXuat = congXuat;
    }

    @Override
    public String toString() {
        return "XeMay " + super.toString() +
                ", congXuat=" + congXuat;
    }
}
