package QuanLyBaiTapNhom;

public class Nhom implements Comparable<Nhom>{
    private SinhVien sv;
    private BaiTap bt;

    public Nhom(SinhVien sv, BaiTap bt) {
        this.sv = sv;
        this.bt = bt;
    }

    @Override
    public String toString() {
        return sv + " " + bt;
    }

    @Override
    public int compareTo(Nhom o) {
        if(sv.getId().compareTo(o.sv.getId()) > 0){
            return 1;
        } else if (sv.getId().compareTo(o.sv.getId()) < 0){
            return -1;
        }
        return 0;
    }
}
