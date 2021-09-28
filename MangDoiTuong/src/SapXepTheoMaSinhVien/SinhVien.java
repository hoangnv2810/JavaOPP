package SapXepTheoMaSinhVien;

public class SinhVien implements Comparable<SinhVien> {
    private String id;
    private String name;
    private String className;
    private String email;

    public SinhVien(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    @Override
    public int compareTo(SinhVien o) {
        if (id.compareTo(o.id) > 0) {
            return 1;
        } else if (id.compareTo(o.id) < 0) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + email;
    }
}