package retest.models;

public abstract class XeTai extends PhuongTien{
    private int trongTan;

    public XeTai() {
    }

    public XeTai(int id, String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int trongTan) {
        super(id, bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.trongTan = trongTan;
    }

    public int getTrongTan() {
        return trongTan;
    }

    public void setTrongTan(int trongTan) {
        this.trongTan = trongTan;
    }

    @Override
    public String toString() {
        return "XeTai " + super.toString() +
                "trongTan=" + trongTan ;
    }
}
