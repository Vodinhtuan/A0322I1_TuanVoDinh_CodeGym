package retest.models;

import retest.util.FileHelperRetest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class XeMay extends PhuongTien{
    private int congXuat;

    public XeMay() {
    }

    public XeMay(int id, String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int congXuat) {
        super(id, bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
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
                "congXuat=" + congXuat;
    }
}
