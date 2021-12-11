package QuanLyBanHang2;

public class MatHang {
    private String ma;
    private String name;
    private String unit;
    private int purchasePrice;
    private int price;

    public MatHang(int ma, String name, String unit, int purchasePrice, int price) {
        this.ma = "MH" + String.format("%03d", ma);
        this.name = name;
        this.unit = unit;
        this.purchasePrice = purchasePrice;
        this.price = price;
    }

    public String getMa() {
        return ma;
    }

    public int getPrice() {
        return price;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    @Override
    public String toString() {
        return name;
    }
}

