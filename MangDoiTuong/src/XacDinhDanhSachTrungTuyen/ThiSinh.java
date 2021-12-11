package XacDinhDanhSachTrungTuyen;

public class ThiSinh implements Comparable<ThiSinh>{
    private String ten, ma;
    private double toan, ly, hoa;

    public ThiSinh(String ma, String ten, double toan, double ly, double hoa) {
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public double tong(){
        return toan*2 + hoa + ly + uuTien();
    }

    private double uuTien(){
        if(ma.startsWith("KV1")){
            return 0.5;
        } else if(ma.startsWith("KV2")){
            return 1;
        } else if(ma.startsWith("KV3")){
            return 2.5;
        } else {
            return 0;
        }
    }

    private String convert(double num){
        if((int) num == num){
            return String.valueOf((int)num);
        }
        return String.valueOf(num);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + convert(uuTien()) + " " + convert(tong());
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(tong() < o.tong()){
            return 1;
        } else if(tong() > o.tong()){
            return -1;
        }
        return 0;
    }
}
