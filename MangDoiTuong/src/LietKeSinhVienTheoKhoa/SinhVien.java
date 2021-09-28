package LietKeSinhVienTheoKhoa;

public class SinhVien{
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

    public String getClassName() {
        return "20" + className.substring(1,3);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + email;
    }
}

