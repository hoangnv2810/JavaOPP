package DiemTuyenSinh;

import java.util.StringTokenizer;

public class ThiSinh implements Comparable<ThiSinh>{
    private String ma;
    private String ten;
    private float diemThi;
    private String danToc;
    private String khuVuc;

    public ThiSinh(int n, String line[]) {
        this.ma = "TS" + String.format("%02d", n);
        this.ten = chuanHoa(line[0]);
        this.diemThi = Float.parseFloat(line[1]);
        this.danToc = line[2];
        this.khuVuc = line[3];
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

    private float diemUTKV(){
        if(khuVuc.compareTo("1") == 0){
            return 1.5F;
        } else if(khuVuc.compareTo("2") == 0){
            return 1F;
        } else {
            return 0;
        }
    }

    private float diemUTDT(){
        if(danToc.compareTo("Kinh") == 0){
            return 0;
        } else {
            return 1.5F;
        }
    }

    private float tongDiem(){
        return diemThi + diemUTDT() + diemUTKV();
    }

    private String ketQua(){
        if(tongDiem() >= 20.5){
            return "Do";
        } else {
            return "Truot";
        }
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tongDiem() + " " + ketQua();
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(tongDiem() < o.tongDiem()){
            return 1;
        } else if(tongDiem() == o.tongDiem()){
            if(ma.compareTo(o.ma) > 0){
                return 1;
            } else {
                return -1;
            }
        }
        return -1;
    }
}
