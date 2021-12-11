package QuanLyBanHang2;

public class HoaDon implements Comparable<HoaDon>{
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

    private long total(){
        return quantity*mh.getPrice();
    }

    private long profit(){
        return quantity*(mh.getPrice() - mh.getPurchasePrice());
    }

    @Override
    public String toString() {
        return ma + " " + kh.toString() + " " + mh.toString() + " " + quantity + " " + total() + " " + profit();
    }

    @Override
    public int compareTo(HoaDon o) {
        if(profit() < o.profit()){
            return 1;
        } else if(profit() > o.profit()){
            return -1;
        }
        return 0;
    }
}
