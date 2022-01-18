package TinhGioChuan;

public class GiangVien {
    private String id;
    private String name;

    public GiangVien() {
    }

    public GiangVien(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }
}
