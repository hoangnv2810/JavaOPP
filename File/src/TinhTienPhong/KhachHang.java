package TinhTienPhong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class KhachHang implements Comparable<KhachHang>{
    private String maKhach;
    private String tenKhach;
    private String soPhong;
    private Date ngayNhan;
    private Date ngayTra;
    private int tienDV;

    public KhachHang(int n, String line[]) throws ParseException {
        this.maKhach = "KH" + String.format("%02d", n);
        this.tenKhach = chuanHoa(line[0]);
        this.soPhong = line[1];
        this.ngayNhan = new SimpleDateFormat("dd/MM/yyyy").parse(line[2]);
        this.ngayTra = new SimpleDateFormat("dd/MM/yyyy").parse(line[3]);
        this.tienDV = Integer.parseInt(line[4]);
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

    private int soNgayO(){
        long diff = ngayTra.getTime()-ngayNhan.getTime();
        return (int) (diff/(1000*60*60*24) + 1);
    }

    private int giaPhong(){
        if(soPhong.startsWith("1")){
            return 25;
        } else if(soPhong.startsWith("2")){
            return 34;
        } else if(soPhong.startsWith("3")){
            return 50;
        } else {
            return 80;
        }
    }

    private int thanhTien(){
        return soNgayO()*giaPhong() + tienDV;
    }

    @Override
    public String toString() {
        return maKhach + " " + tenKhach + " " + soPhong + " " + soNgayO() + " " + thanhTien();
    }

    @Override
    public int compareTo(KhachHang o) {
        if(thanhTien() > o.thanhTien()){
            return -1;
        } else if(thanhTien() < o.thanhTien()){
            return 1;
        }
        return 0;
    }
}
