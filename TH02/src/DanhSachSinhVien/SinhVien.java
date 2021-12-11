package DanhSachSinhVien;

import java.util.StringTokenizer;

public class SinhVien implements Comparable<SinhVien>{
    private String id;
    private String name;
    private String className;
    private String email;

    public SinhVien(String id, String ten, String className, String email) {
        this.id = id;
        this.name = chuanHoa(ten);
        this.className = className.replace("\\s+", "");
        this.email = email.replace("\\s+", "");
    }

    private String chuanHoa(String name){
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(name);
        while (st.hasMoreTokens()){
            String s = st.nextToken();
            sb.append(Character.toUpperCase(s.charAt(0)));
            for(int i = 1; i < s.length(); i++){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + email;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(id.compareTo(o.id) > 0){
            return 1;
        } else if(id.compareTo(o.id) < 0){
            return -1;
        }
        return 0;
    }
}
