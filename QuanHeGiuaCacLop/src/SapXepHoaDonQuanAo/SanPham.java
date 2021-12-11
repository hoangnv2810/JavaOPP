package SapXepHoaDonQuanAo;

public class SanPham {
    private String id;
    private String name;
    private int price1;
    private int price2;

    public SanPham() {
    }

    public SanPham(String id, String name, int price1, int price2) {
        this.id = id;
        this.name = name;
        this.price1 = price1;
        this.price2 = price2;
    }

    public String getId() {
        return id;
    }

    public int getPrice1() {
        return price1;
    }

    public int getPrice2() {
        return price2;
    }

    @Override
    public String toString() {
        return name;
    }
}
