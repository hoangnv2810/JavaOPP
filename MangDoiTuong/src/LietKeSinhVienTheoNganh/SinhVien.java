package LietKeSinhVienTheoNganh;

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
        return className.substring(0,1);
    }

    public String getId(){
        return id.substring(3,7);
    }

    public static String handle(String s){
        if(s.compareTo("Ke toan") == 0){
            return "DCKT";
        } else if(s.compareTo("Cong nghe thong tin") == 0){
            return "DCCN";
        } else if(s.compareTo("An toan thong tin") == 0){
            return "DCAT";
        } else if(s.compareTo("Vien thong") == 0){
            return "DCVT";
        } else {
            return "DCDT";
        }
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + email;
    }
}


