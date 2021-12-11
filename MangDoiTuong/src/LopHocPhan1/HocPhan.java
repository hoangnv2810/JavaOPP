package LopHocPhan1;

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

    @Override
    public String toString() {
        return nhom + " " + tenGV;
    }

    @Override
    public int compareTo(HocPhan o) {
        if(nhom.compareTo(o.nhom) > 0){
            return 1;
        } else if(nhom.compareTo(o.nhom) < 0){
            return -1;
        }
        return 0;
    }
}
