package TinhGioChuan;

public class GioChuan {
    private GiangVien gv;
    private MonHoc mh;
    private Double gio;

    public GioChuan(GiangVien gv, MonHoc mh, Double gio) {
        this.gv = gv;
        this.mh = mh;
        this.gio = gio;
    }

    public GiangVien getGv() {
        return gv;
    }

    public MonHoc getMh() {
        return mh;
    }

    public Double getGio() {
        return gio;
    }

    @Override
    public String toString() {
        return gv + " " + String.format("%.2f", gio);
    }
}
