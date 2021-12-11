package LopHocPhan2;

public class HocPhan implements Comparable<HocPhan>{
    private String ma, ten, nhom, tenGV;

    public HocPhan(String ma, String ten, String nhom, String tenGV) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.tenGV = tenGV;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getTenGV() {
        return tenGV;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + nhom;
    }

    @Override
    public int compareTo(HocPhan o) {
        if(ma.compareTo(o.ma) > 0){
            return 1;
        } else if(ma.compareTo(o.ma) == 0){
            if(nhom.compareTo(o.nhom) > 0){
                return 1;
            } else {
                return -1;
            }
        }
        return -1;
    }
}
