package BangXepHang;

import java.util.StringTokenizer;

public class HocSinh implements Comparable<HocSinh>{
    private String name;
    private int ac;
    private int submit;

    public HocSinh(String name, int ac, int submit) {
        this.name = chuanHoa(name);
        this.ac = ac;
        this.submit = submit;
    }

    private String chuanHoa(String name) {
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
        return name + " " + ac + " " + submit;
    }

    @Override
    public int compareTo(HocSinh o) {
        if(ac > o.ac){
            return -1;
        } else if(ac == o.ac){
            if(submit > o.submit){
                return 1;
            } else if(submit == o.submit){
                if(name.compareTo(o.name) > 0){
                    return 1;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        }
        return 1;
    }
}
