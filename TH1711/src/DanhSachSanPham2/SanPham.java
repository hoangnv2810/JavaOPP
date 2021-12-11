package DanhSachSanPham2;

public class SanPham implements Comparable<SanPham>{
    private String ma;
    private String ten;
    private int gia;
    private int thoiLuongBH;

    public SanPham(String ma, String ten, int gia, int thoiLuongBH) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.thoiLuongBH = thoiLuongBH;
    }

    @Override
    public int compareTo(SanPham o) {
        if(gia < o.gia){
            return 1;
        } else if(gia == o.gia){
            if(ma.compareTo(o.ma) > 0){
                return 1;
            } else {
                return -1;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gia + " " + thoiLuongBH;
    }
}
