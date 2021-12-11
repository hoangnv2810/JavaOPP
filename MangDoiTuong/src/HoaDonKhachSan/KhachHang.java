package HoaDonKhachSan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang implements Comparable<KhachHang>{
    private String ma, ten, phong;
    private Date ngaynhan, ngaytra;
    private int tienDV;

    public KhachHang(int ma, String ten, String phong, String ngaynhan, String ngaytra, int tienDV) throws ParseException {
        this.ma = "KH" + String.format("%02d", ma);
        this.ten = ten.trim();
        this.phong = phong.trim();
        this.ngaynhan = new SimpleDateFormat("dd/MM/yyyy").parse(ngaynhan);
        this.ngaytra = new SimpleDateFormat("dd/MM/yyyy").parse(ngaytra);
        this.tienDV = tienDV;
    }

    private int songayo(){
        long diff = ngaytra.getTime()-ngaynhan.getTime();
        return (int) (diff/(1000*60*60*24))+1;
    }

    private int dongia(){
        if(phong.startsWith("1")){
            return 25;
        } else if(phong.startsWith("2")){
            return 34;
        } else if(phong.startsWith("3")){
            return 50;
        } else {
            return 80;
        }
    }

    private int tong(){
        return dongia()*songayo()+tienDV;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + phong + " " + songayo() + " " + tong();
    }

    @Override
    public int compareTo(KhachHang o) {
        if(tong() < o.tong()){
            return 1;
        } else if(tong() > o.tong()){
            return -1;
        }
        return 0;
    }
}
