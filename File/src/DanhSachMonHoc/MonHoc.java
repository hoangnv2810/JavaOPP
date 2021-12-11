package DanhSachMonHoc;

public class MonHoc implements Comparable<MonHoc>{
    private String ma, ten;
    private int tinChi;

    public MonHoc(String ma, String ten, int tinChi) {
        this.ma = ma;
        this.ten = ten;
        this.tinChi = tinChi;
    }

    @Override
    public int compareTo(MonHoc o) {
        if(ten.compareTo(o.ten) > 0){
            return 1;
        } else if(ten.compareTo(o.ten) < 0){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tinChi;
    }
}
