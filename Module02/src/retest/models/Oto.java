package retest.models;

public abstract class Oto extends PhuongTien{
    private int soChoNgoi;
    private String kieuxe;

    public Oto() {
    }

    public Oto(int id, String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuxe) {
        super(id, bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuxe = kieuxe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuxe() {
        return kieuxe;
    }

    public void setKieuxe(String kieuxe) {
        this.kieuxe = kieuxe;
    }

    public void themMoiXeMay() {

    }

    @Override
    public String toString() {
        return "Oto " + super.toString() +
                "soChoNgoi=" + soChoNgoi +
                ", kieuxe='" + kieuxe;
    }
}
