package HoaDon2;

public class HoaDon {
    private String id;
    private KhachHang kh;
    private MatHang mh;
    private int quantity;

    public HoaDon(int n, KhachHang kh, MatHang mh, int quantity) {
        this.id = "HD" + String.format("%03d", n);
        this.kh = kh;
        this.mh = mh;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return id + " " + kh + " " + mh + " " + mh.getPurchasePrice() + " " + mh.getPrice() + " " + quantity + " " + mh.getPrice()*quantity;
    }
}
