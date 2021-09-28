package DanhSachThucTap2;

import java.util.StringTokenizer;

public class SinhVien implements Comparable<SinhVien>{
    private String number;
    private String id;
    private String name;
    private String className;
    private String email;
    private String enterprise;

    public SinhVien(int number, String id, String name, String className, String email, String enterprise) {
        this.number = String.valueOf(number);
        this.id = id.trim();
        this.name = chuanHoa(name);
        this.className = className.trim();
        this.email = email.trim();
        this.enterprise = enterprise.trim();
    }

    private String chuanHoa(String name) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(name);
        while(st.hasMoreTokens()){
            String t = st.nextToken();
            sb.append(Character.toUpperCase(t.charAt(0)));
            for(int i = 1; i < t.length(); i++){
                sb.append(Character.toLowerCase(t.charAt(i)));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public String getEnterprise() {
        return enterprise;
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

    @Override
    public String toString() {
        return number + " " + id + " " + name + " " + className + " " + email + " " + enterprise;
    }
}

