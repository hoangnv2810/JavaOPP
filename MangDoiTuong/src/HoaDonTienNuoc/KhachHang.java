package HoaDonTienNuoc;

public class KhachHang implements Comparable<KhachHang> {
    private String ma, ten;
    private int socu, somoi;

    public KhachHang(int ma, String ten, int socu, int somoi) {
        this.ma = "KH" + String.format("%02d", ma);
        this.ten = ten;
        this.socu = socu;
        this.somoi = somoi;
    }

    private long tongTien() {
        int sokhoi = somoi - socu;
        if (sokhoi > 100) {
            return Math.round(((50 * 100 + 50 * 150 + (sokhoi - 100) * 200) * 1.05));
        } else if (sokhoi > 50) {
            return Math.round((((sokhoi - 50) * 150 + 50 * 100) * 1.03));
        } else {
            return Math.round((sokhoi * 100 * 1.02));
        }
    }

    @Override
    public int compareTo(KhachHang o) {
        if (tongTien() < o.tongTien()) {
            return 1;
        } else if (tongTien() > o.tongTien()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tongTien();
    }
}
