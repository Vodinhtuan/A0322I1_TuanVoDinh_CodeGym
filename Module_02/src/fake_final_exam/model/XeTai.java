package fake_final_exam.model;

public class XeTai extends PhuongTienAbs{
    private double trongTai;

    public XeTai() {
    }

    public XeTai(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai " + super.toString() +
                ", trongTai=" + trongTai;
    }

    @Override
    public String getInfor() {
        return String.format("%s,%s,%d,%s,%f\n",this.getBienKiemSoat(),this.getTenHangSanXuat(), this.getNamSanXuat(),this.getChuSoHuu(),this.getTrongTai());
    }
}
