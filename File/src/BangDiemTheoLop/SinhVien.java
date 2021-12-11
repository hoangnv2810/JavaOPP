package BangDiemTheoLop;

import java.util.StringTokenizer;

public class SinhVien {
    private String ma, ten, lop, email;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = chuanHoa(ten);
        this.lop = lop;
        this.email = email;
    }

    private String chuanHoa(String name){
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(name);
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

    public String getMa() {
        return ma;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop;
    }
}

