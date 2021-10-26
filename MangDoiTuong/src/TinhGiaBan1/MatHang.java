package TinhGiaBan1;

public class MatHang {
    private String id;
    private String name;
    private String unit;
    private long unitPrice;
    private long quantity;

    public MatHang(int n, String name, String unit, long unitPrice, long quantity) {
        this.id = "MH" + String.format("%02d", n);
        this.name = name;
        this.unit = unit;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    private long transportFee(){
        return Math.round((unitPrice*quantity)*0.05);
    }

    private long total(){
        return unitPrice*quantity + transportFee();
    }

    private long price(){
        return Math.round(total() + 0.02*total());
    }

    @Override
    public String toString() {
        return id + " " + name + " " + unit + " " + transportFee() + " " + total() + " " + price();
    }
}
