package TinhToanGiaBan;

public class DonHang {
    private String id;
    private int price;
    private int quantity;

    public DonHang(String id, int price, int quantity) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    private long total(){
        return price*quantity;
    }

    private double phiVanChuyen(){
        if(id.startsWith("T")){
            return total()*4/100;
        } else if(id.startsWith("C")){
            return total()*3/100;
        } else if(id.startsWith("D")){
            return total()*1/40;
        } else if(id.startsWith("M")){
            return total()*1/200;
        } else {
            return 0;
        }
    }

    private double thue(){
        if(id.startsWith("T")){
            return total()*29/100;
        } else if(id.startsWith("C")){
            return total()*10/100;
        } else if(id.startsWith("D")){
            return total()*8/100;
        } else if(id.startsWith("M")){
            return total()*2/100;
        } else {
            return 0;
        }
    }

    private double totalTax(){
        if(id.endsWith("C")){
            return thue()*95/100;
        } else {
            return thue();
        }
    }

    public String giaBan(){
        double sum = (total() + phiVanChuyen() + totalTax())/quantity;
        double res = sum+ sum*20/100;
        return String.format("%.2f", (double) Math.round(res*100)/100);
    }

    @Override
    public String toString() {
        return id + " " + giaBan();
    }
}
