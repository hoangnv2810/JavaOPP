package HoaDon2;

public class MatHang {
    private String id;
    private String name;
    private String unit;
    private int purchasePrice;
    private int price;

    public MatHang() {
    }

    public MatHang(int n, String name, String unit, int purchasePrice, int price) {
        this.id = "MH" + String.format("%03d", n);
        this.name = name;
        this.unit = unit;
        this.purchasePrice = purchasePrice;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " " + unit;
    }
}
