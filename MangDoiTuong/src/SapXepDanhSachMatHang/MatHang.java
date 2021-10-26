package SapXepDanhSachMatHang;

public class MatHang implements Comparable<MatHang>{
    private int id;
    private String name;
    private String group;
    private double purchase;
    private double price;

    public MatHang(int id, String name, String group, double purchase, double price) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.purchase = purchase;
        this.price = price;
    }

    private double profit(){
        return price-purchase;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + group + " " + String.format("%.2f", profit());
    }

    @Override
    public int compareTo(MatHang o) {
        if(profit() > o.profit()){
            return -1;
        } else if(profit() < o.profit()){
            return 1;
        }
        return 0;
    }
}
