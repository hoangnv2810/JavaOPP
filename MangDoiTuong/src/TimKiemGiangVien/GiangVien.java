package TimKiemGiangVien;
import java.util.*;
public class GiangVien {
    private String id;
    private String name;
    private String subject;

    public GiangVien(int n, String name, String subject) {
        this.id = "GV" + String.format("%02d", n);
        this.name = name;
        this.subject = subject;
    }

    private String hanlde() {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(subject);
        while(st.hasMoreTokens()){
            String t = st.nextToken();
            sb.append(Character.toUpperCase(t.charAt(0)));
        }
        return sb.toString().trim();
    }

    public Boolean search(String key){
        String tmp = name.toLowerCase();
        return tmp.contains(key) == true;
    }



    @Override
    public String toString() {
        return id + " " + name + " " + hanlde();
    }
}
