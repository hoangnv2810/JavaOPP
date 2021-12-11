package TinhDiemTrungBinh;

import java.util.StringTokenizer;

public class SinhVien implements Comparable<SinhVien>{
    private String ma;
    private String ten;
    private float diem1;
    private float diem2;
    private float diem3;

    public SinhVien(int n, String line[]) {
        this.ma = "SV" + String.format("%02d", n);
        this.ten = chuanHoa(line[0]);
        this.diem1 = Float.parseFloat(line[1]);
        this.diem2 = Float.parseFloat(line[2]);
        this.diem3 = Float.parseFloat(line[3]);
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

    public float diemTB(){
        float tmp = (diem1*3 + diem2*3 + diem3*2)/8;
        return (float) Math.round(tmp*100)/100;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + String.format("%.2f", diemTB());
    }

    @Override
    public int compareTo(SinhVien o) {
        if(diemTB() < o.diemTB()){
            return 1;
        } else if(diemTB() == o.diemTB()){
            if(ma.compareTo(o.ma) > 0){
                return 1;
            } else {
                return -1;
            }
        }
        return -1;
    }
}
