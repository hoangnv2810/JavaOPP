package SapXepLichThi;

public class MonThi {
    private String ma, ten, hinhThuc;

    public MonThi() {
    }

    public MonThi(String ma, String ten, String hinhThuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhThuc = hinhThuc;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ten;
    }
}