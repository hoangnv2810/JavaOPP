package TraCuuDonHang;

public class DonHang {
    private String name;
    private String id;
    private int price;
    private int quantity;

    public DonHang(String name, String id, int price, int quantity) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    private String number(){
        return id.substring(1,4);
    }

    private String discountCode(){
        return id.substring(4,5);
    }

    private long discountPrice(){
        if(discountCode().equals("1")){
            return (long)(0.5*price*quantity);
        } else {
            return (long)(0.3*price*quantity);
        }
    }

    private long totalMoney(){
        return price*quantity - discountPrice();
    }

    @Override
    public String toString() {
        return name + " " + id + " " + number() + " " + discountPrice() + " " + totalMoney();
    }
}
