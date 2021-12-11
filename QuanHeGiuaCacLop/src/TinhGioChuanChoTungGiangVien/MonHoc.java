package TinhGioChuanChoTungGiangVien;

public class MonHoc {
    private String ma;
    private String name;

    public MonHoc() {
    }

    public MonHoc(String ma, String name) {
        this.ma = ma;
        this.name = name;
    }

    public String getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

