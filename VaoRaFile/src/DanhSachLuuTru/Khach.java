package DanhSachLuuTru;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Khach implements Comparable<Khach>{
    private String ma;
    private String ten;
    private String maPhong;
    private Date ngayDen;
    private Date ngayDi;

    public Khach(int n, String ten, String maPhong, String ngayDen, String ngayDi) throws ParseException {
        this.ma = "KH" + String.format("%02d", n);
        this.ten = ten;
        this.maPhong = maPhong;
        this.ngayDen = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDen);
        this.ngayDi = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDi);
    }

    private long soNgayLuuTru(){
        long diff = ngayDi.getTime()-ngayDen.getTime();
        long days = diff/(1000*60*60*24);
        return days;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + maPhong + " " + String.valueOf(soNgayLuuTru());
    }

    @Override
    public int compareTo(Khach o) {
        if(soNgayLuuTru() < o.soNgayLuuTru()){
            return 1;
        } else if(soNgayLuuTru() > o.soNgayLuuTru()){
            return -1;
        }
        return 0;
    }
}
