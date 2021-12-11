package QuanLyBaiTapNhom;

public class BaiTap {
    private String id;
    private String name;

    public BaiTap() {
    }

    public BaiTap(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
