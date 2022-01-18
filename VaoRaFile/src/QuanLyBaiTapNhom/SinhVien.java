package QuanLyBaiTapNhom;

public class SinhVien {
    private String id;
    private String name;
    private String phone;

    public SinhVien() {
    }

    public SinhVien(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phone;
    }
}
