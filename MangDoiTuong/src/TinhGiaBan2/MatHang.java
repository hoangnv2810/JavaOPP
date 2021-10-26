package TinhGiaBan2;

public class MatHang implements Comparable<MatHang>{
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
        return (long) (Math.ceil((double)((total() + 0.02*total())/(quantity*100)))*100);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + unit + " " + transportFee() + " " + total() + " " + price();
    }

    @Override
    public int compareTo(MatHang o) {
        if(price() > o.price()){
            return -1;
        } else if(price() < o.price()){
            return 1;
        }
        return 0;
    }
}
