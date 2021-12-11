package XepLoai;

import java.util.StringTokenizer;

public class BangDiem implements Comparable<BangDiem>{
    private String ma;
    private String ten;
    private float diemLT;
    private float diemTH;
    private float diemThi;

    public BangDiem(int n, String line[]) {
        this.ma = "SV" + String.format("%02d", n);
        this.ten = chuanHoa(line[0]);
        this.diemLT = Float.parseFloat(line[1]);
        this.diemTH = Float.parseFloat(line[2]);
        this.diemThi = Float.parseFloat(line[3]);
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

    private float diemTK(){
        return diemLT*0.25F + diemTH*0.35F + diemThi*0.4F;
    }

    private String xepLoai(){
        if(diemTK() >= 8){
            return "GIOI";
        } else if(diemTK() >= 6.5){
            return "KHA";
        } else if(diemTK() >= 5){
            return "TRUNG BINH";
        } else {
            return "KEM";
        }
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + String.format("%.2f", diemTK()) + " " + xepLoai();
    }

    @Override
    public int compareTo(BangDiem o) {
        if(diemTK() < o.diemTK()){
            return 1;
        } else if(diemTK() > o.diemTK()){
            return -1;
        }
        return 0;
    }
}
