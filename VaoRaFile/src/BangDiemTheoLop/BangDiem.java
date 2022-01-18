package BangDiemTheoLop;

public class BangDiem implements Comparable<BangDiem>{
    private MonHoc mh;
    private SinhVien sv;
    private String diem;

    public BangDiem(SinhVien sv, MonHoc mh, String diem) {
        this.mh = mh;
        this.sv = sv;
        this.diem = diem;
    }

    public MonHoc getMh() {
        return mh;
    }

    public SinhVien getSv() {
        return sv;
    }

    public String getDiem() {
        return diem;
    }

    private String convert(double num){
        if((int)num == num){
            return String.valueOf((int)num);
        }
        return String.valueOf(num);
    }

    @Override
    public String toString() {
        return sv + " " + mh + " " + diem;
    }

    @Override
    public int compareTo(BangDiem o) {
        if(mh.getMa().compareTo(o.mh.getMa()) > 0){
            return 1;
        } else if(mh.getMa().compareTo(o.mh.getMa()) == 0){
            if(sv.getMa().compareTo(o.sv.getMa()) > 0){
                return 1;
            } else {
                return -1;
            }
        }
        return -1;
    }
}

