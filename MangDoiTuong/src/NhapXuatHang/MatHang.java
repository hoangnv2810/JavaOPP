package NhapXuatHang;

public class MatHang {
    private String ma, ten, xepLoai;

    public MatHang(String ma, String ten, String xepLoai) {
        this.ma = ma;
        this.ten = ten;
        this.xepLoai = xepLoai;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }
}
