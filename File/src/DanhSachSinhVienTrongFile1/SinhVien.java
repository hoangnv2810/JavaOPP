package DanhSachSinhVienTrongFile1;

import java.util.StringTokenizer;

public class SinhVien implements Comparable<SinhVien>{
    private String ma, ten, lop, email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = chuanHoa(ten);
        this.lop = lop;
        this.email = email;
    }

    private String chuanHoa(String s) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()){
            String tmp = st.nextToken();
            sb.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1; i < tmp.length(); i++){
                sb.append(Character.toLowerCase(tmp.charAt(i)));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(ma.compareTo(o.ma) > 0){
            return 1;
        } else if(ma.compareTo(o.ma) < 0){
            return -1;
        }
        return 0;
    }
}
