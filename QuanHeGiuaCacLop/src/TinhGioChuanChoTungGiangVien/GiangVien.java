package TinhGioChuanChoTungGiangVien;

public class GiangVien {
    private String ma;
    private String name;

    public GiangVien() {
    }

    public GiangVien(String ma, String name) {
        this.ma = ma;
        this.name = name;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return name;
    }
}

