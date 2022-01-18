package DanhSachMonThi;

public class MonHoc implements Comparable<MonHoc> {
    private String ma, ten, hinhThuc;

    public MonHoc(String ma, String ten, String hinhThuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhThuc = hinhThuc;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + hinhThuc;
    }

    @Override
    public int compareTo(MonHoc o) {
        if(ma.compareTo(o.ma) > 0){
            return 1;
        } else if(ma.compareTo(o.ma) < 0){
            return -1;
        }
        return 0;
    }
}
