package QuanLyBaiTapNhom2;

public class Student {
    private String id;
    private String name;
    private String numberPhone;
    private String idGroup;

    public Student(String id, String name, String numberPhone, String idGroup) {
        this.id = id;
        this.name = name;
        this.numberPhone = numberPhone;
        this.idGroup = idGroup;
    }

    public String getIdGroup() {
        return idGroup;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + numberPhone;
    }
}
