package BangTinhGioChuan;

public class Day {
    private GiangVien gv;
    private MonHoc mh;
    private Double gio;

    public Day(GiangVien gv, MonHoc mh, Double gio) {
        this.gv = gv;
        this.mh = mh;
        this.gio = gio;
    }

    public Day(GiangVien gv, Double gio) {
        this.gv = gv;
        this.gio = gio;
    }

    public GiangVien getGv() {
        return gv;
    }

    public Double getGio() {
        return gio;
    }

    public void setGio(Double gio) {
        this.gio = gio;
    }

    @Override
    public String toString() {
        return gv + " " + String.format("%.2f", gio);
    }
}
