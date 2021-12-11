package DanhSachKhachHang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class KhachHang implements Comparable<KhachHang>{
    private String ma, ten, gioitinh, diachi;
    private Date ngaysinh;

    public KhachHang(int ma, String ten, String gioitinh, String ngaysinh, String diachi) throws ParseException {
        this.ma = "KH" + String.format("%03d", ma);
        this.ten = chuaHoa(ten);
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
    }

    private String chuaHoa(String ten) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(ten);
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
    public int compareTo(KhachHang o) {
        if(ngaysinh.before(o.ngaysinh)){
            return -1;
        } else if(ngaysinh.after(o.ngaysinh)){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gioitinh + " " + diachi + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh);
    }
}
