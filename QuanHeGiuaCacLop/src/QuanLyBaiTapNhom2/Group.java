package QuanLyBaiTapNhom2;

public class Group implements Comparable<Group>{
    private String id;
    private String nameBT;
    private Student student;

    public Group(String id, String nameBT, Student student) {
        this.id = id;
        this.nameBT = nameBT;
        this.student = student;
    }

    public Group(String idGroup, String nameBT) {
        this.id = idGroup;
        this.nameBT = nameBT;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return student.toString() + " " + id + " " + nameBT;
    }

    @Override
    public int compareTo(Group o) {
        if(student.getId().compareTo(o.student.getId()) > 0){
            return 1;
        } else if(student.getId().compareTo(o.student.getId()) < 0){
            return -1;
        }
        return 0;
    }
}
