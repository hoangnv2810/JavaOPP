package SapXepDanhSachGiangVien;

import java.util.StringTokenizer;

public class GiangVien implements Comparable<GiangVien>{
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

    private String hanldeName(){
        String[] temp = name.split("\\s+");
        return temp[temp.length-1];
    }

    @Override
    public int compareTo(GiangVien o) {
        if(hanldeName().compareTo(o.hanldeName()) > 0){
            return 1;
        } else if(hanldeName().compareTo(o.hanldeName()) == 0){
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
        return id + " " + name + " " + hanlde();
    }
}
