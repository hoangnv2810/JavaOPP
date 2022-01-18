package BangDiemTheoMonHoc;

public class BangDiem implements Comparable<BangDiem>{
    private MonHoc mh;
    private SinhVien sv;
    private double diem;

    public BangDiem(SinhVien sv, MonHoc mh, double diem) {
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

    public double getDiem() {
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
        return sv + " " + convert(diem);
    }

    @Override
    public int compareTo(BangDiem o) {
        if(diem < o.diem){
            return 1;
        } else if(diem == o.diem){
            if(sv.getMa().compareTo(o.sv.getMa()) > 0){
                return 1;
            } else {
                return -1;
            }
        }
        return -1;
    }
}
