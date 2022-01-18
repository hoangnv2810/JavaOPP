package DanhSachThucTap;

public class ThucTap implements Comparable<ThucTap>{
    private SinhVien sv;
    private DoanhNghiep dn;

    public ThucTap(SinhVien sv, DoanhNghiep dn) {
        this.sv = sv;
        this.dn = dn;
    }


    public DoanhNghiep getDn() {
        return dn;
    }

    @Override
    public String toString() {
        return sv.toString();
    }

    @Override
    public int compareTo(ThucTap o) {
            if(sv.getId().compareTo(o.sv.getId()) > 0){
                return 1;
            } else if(sv.getId().compareTo(o.sv.getId()) < 0){
                return -1;
            }
            return 0;

    }
}
