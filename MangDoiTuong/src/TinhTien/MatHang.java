package TinhTien;

public class MatHang implements Comparable<MatHang>{
    private String ma, ten;
    private int soluong;
    private long dongia, chieukhau;

    public MatHang(String ma, String ten, int soluong, long dongia, long chieukhau) {
        this.ma = ma;
        this.ten = ten;
        this.soluong = soluong;
        this.dongia = dongia;
        this.chieukhau = chieukhau;
    }

    private long thanhtoan(){
        return dongia*soluong-chieukhau;
    }

    @Override
    public int compareTo(MatHang o) {
        if(thanhtoan() < o.thanhtoan()){
            return 1;
        } else if(thanhtoan() > o.thanhtoan()){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soluong + " " + dongia + " " + chieukhau + " " + thanhtoan();
    }
}
