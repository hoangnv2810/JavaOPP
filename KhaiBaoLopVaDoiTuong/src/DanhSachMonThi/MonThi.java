package DanhSachMonThi;

public class MonThi implements Comparable<MonThi>{
    private String ma, ten, hinhthuc;

    public MonThi(String ma, String ten, String hinhthuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhthuc = hinhthuc;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + hinhthuc;
    }


    @Override
    public int compareTo(MonThi o) {
        if(ma.compareTo(o.ma) > 0){
            return 1;
        } else if(ma.compareTo(o.ma) < 0){
            return -1;
        }
        return 0;
    }
}
