package QuanLyBaiTapNhom1;

public class Student {
    private String id;
    private String name;
    private String numberPhone;
    private String groupId;

    public Student(String id, String name, String numberPhone, String groupId) {
        this.id = id;
        this.name = name;
        this.numberPhone = numberPhone;
        this.groupId = groupId;
    }

    public String getGroupId() {
        return groupId;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + numberPhone;
    }
}
