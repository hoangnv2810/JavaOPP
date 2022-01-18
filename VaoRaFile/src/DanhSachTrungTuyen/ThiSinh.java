package DanhSachTrungTuyen;

import java.util.StringTokenizer;

public class ThiSinh implements Comparable<ThiSinh>{
    private String ma;
    private String ten;
    private float diemToan;
    private float diemLy;
    private float diemHoa;

    public ThiSinh(String line[]) {
        this.ma = line[0];
        this.ten = chuanHoa(line[1]);
        this.diemToan = Float.parseFloat(line[2]);
        this.diemLy = Float.parseFloat(line[3]);
        this.diemHoa = Float.parseFloat(line[4]);
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

    private float diemUuTien(){
        if(ma.startsWith("KV1")){
            return 0.5F;
        } else if(ma.startsWith("KV2")){
            return 1F;
        } else {
            return 2.5F;
        }
    }

    public float tongDiem(){
        return diemToan*2 + diemHoa + diemLy + diemUuTien();
    }

    private String formatNumber(float num){
        String tmp = String.valueOf(num);
        int index = tmp.indexOf(".");
        if(Integer.parseInt(tmp.substring(0, index)) == num){
            return tmp.substring(0, index);
        }
        return tmp;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + formatNumber(diemUuTien()) + " " + formatNumber(tongDiem());
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(tongDiem() < o.tongDiem()){
            return 1;
        } else if(tongDiem() > o.tongDiem()){
            return -1;
        }
        return 0;
    }
}
