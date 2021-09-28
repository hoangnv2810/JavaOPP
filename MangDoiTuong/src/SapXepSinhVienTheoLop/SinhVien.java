package SapXepSinhVienTheoLop;

public class SinhVien implements Comparable<SinhVien>{
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
        if(className.compareTo(o.className) > 0){
            return 1;
        } else if(className.compareTo(o.className) == 0){
            if(id.compareTo(o.id) > 0){
                return 1;
            } else {
                return -1;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + email;
    }
}
