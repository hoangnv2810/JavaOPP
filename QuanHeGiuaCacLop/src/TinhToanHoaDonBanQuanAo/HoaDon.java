package TinhToanHoaDonBanQuanAo;

public class HoaDon {
    private String id;
    private SanPham sp;
    private int quantity;

    public HoaDon(int n, String id, SanPham sp, int quantity) {
        this.id = id + String.format("-%03d", n);
        this.sp = sp;
        this.quantity = quantity;
    }

    private long sum(){
        if(id.charAt(2) == '1'){
            return quantity*sp.getPrice1();
        } else {
            return quantity*sp.getPrice2();
        }
    }

    private long discountTotal(){
        if(quantity >= 150){
            return sum()*1/2;
        } else if(quantity >= 100){
            return sum()*3/10;
        } else if(quantity >= 50){
            return sum()*15/100;
        } else {
            return 0;
        }
    }


    private long total(){
        return sum() - discountTotal();
    }

    @Override
    public String toString() {
        return id + " " + sp + " " + discountTotal() + " " + total();
    }
}
