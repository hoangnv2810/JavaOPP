package DanhSachGiangVienTheoBoMon;

import java.util.StringTokenizer;

public class GiangVien{
    private String id;
    private String name;
    private String subject;

    public GiangVien() {
    }

    public GiangVien(int n, String name, String subject) {
        this.id = "GV" + String.format("%02d", n);
        this.name = name;
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public static String hanlde(String subject) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(subject);
        while(st.hasMoreTokens()){
            String t = st.nextToken();
            sb.append(Character.toUpperCase(t.charAt(0)));
        }
        return sb.toString().trim();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + hanlde(subject);
    }
}
