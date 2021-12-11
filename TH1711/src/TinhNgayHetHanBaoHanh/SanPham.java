package TinhNgayHetHanBaoHanh;

public class SanPham {
    private String ma;
    private String ten;
    private int giaBan;
    private int thoiLuongBH;

    public SanPham(String ma, String ten, int giaBan, int thoiLuongBH) {
        this.ma = ma;
        this.ten = ten;
        this.giaBan = giaBan;
        this.thoiLuongBH = thoiLuongBH;
    }

    public String getMa() {
        return ma;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public int getThoiLuongBH() {
        return thoiLuongBH;
    }
}
