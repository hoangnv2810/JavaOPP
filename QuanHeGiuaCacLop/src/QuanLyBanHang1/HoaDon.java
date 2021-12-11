package QuanLyBanHang1;

public class HoaDon {
    private String ma;
    private KhachHang kh;
    private MatHang mh;
    private int quantity;

    public HoaDon(int ma, KhachHang kh, MatHang mh, int quantity) {
        this.ma = "HD" + String.format("%03d", ma);
        this.kh = kh;
        this.mh = mh;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return ma + " " + kh.toString() + " " + mh.toString() + " " + quantity + " " + quantity*mh.getPrice();
    }
}
