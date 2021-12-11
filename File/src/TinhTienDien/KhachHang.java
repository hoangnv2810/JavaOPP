package TinhTienDien;

import java.util.StringTokenizer;

public class KhachHang implements Comparable<KhachHang>{
    private String ma;
    private String ten;
    private String loaiHDG;
    private float soDau;
    private float soCuoi;

    public KhachHang(int n, String line[]) {
        this.ma = "KH" + String.format("%02d", n);
        this.ten = chuanHoa(line[0]);
        this.loaiHDG = line[1].split("\\s+")[0];
        this.soDau = Float.parseFloat(line[1].split("\\s+")[1]);
        this.soCuoi = Float.parseFloat(line[1].split("\\s+")[2]);
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

    private int dinhMuc(){
        if(loaiHDG.compareTo("A") == 0){
            return 100;
        } else if(loaiHDG.compareTo("B") == 0){
            return 500;
        } else {
            return 200;
        }
    }

    private int tienTrongDM(){
        if(soCuoi-soDau < dinhMuc()){
            return (int)((soCuoi-soDau)*450);
        }
        return dinhMuc()*450;
    }

    private int tienVuotDM(){
        if(soCuoi-soDau > dinhMuc()){
            return (int)((soCuoi-soDau-dinhMuc())*1000);
        }
        return 0;
    }

    private int thueVAT(){
        return (int) tienVuotDM()*5/100;
    }

    private int tongTien(){
        return (int) (tienTrongDM()+tienVuotDM()+thueVAT());
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tienTrongDM() + " " + tienVuotDM() + " " + thueVAT() + " " + tongTien();
    }

    @Override
    public int compareTo(KhachHang o) {
        if(tongTien() < o.tongTien()){
            return 1;
        } else if(tongTien() > o.tongTien()){
            return -1;
        }
        return 0;
    }
}
