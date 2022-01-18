package QuanLyKhachSan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang implements Comparable<KhachHang> {
    private String ma;
    private String ten;
    private String maPhong;
    private Date ngayDen;
    private Date ngayDi;
    private LoaiPhong loaiPhong;

    public KhachHang(int n, String ten, String maPhong, String ngayDen, String ngayDi, LoaiPhong loaiPhong) throws ParseException {
        this.ma = "KH" + String.format("%02d", n);
        this.ten = ten;
        this.maPhong = maPhong;
        this.ngayDen = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDen);
        this.ngayDi = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDi);
        this.loaiPhong = loaiPhong;
    }

    private long soNgayLuuTru(){
        long diff = ngayDi.getTime()-ngayDen.getTime();
        long days = diff/(1000*60*60*24);
        return days;
    }

    private double tienPhong(){
        double tmp = soNgayLuuTru()*loaiPhong.getDonGia()+tienPhucVu();
        if(soNgayLuuTru() >= 30){
            return (tmp - tmp*6/100);
        } else if(soNgayLuuTru() >= 20){
            return (tmp - tmp*4/100);
        } else if(soNgayLuuTru() >= 10){
            return (tmp - tmp*2/100);
        } else if(soNgayLuuTru() == 0){
            return (loaiPhong.getDonGia()+tienPhucVu());
        } else {
            return tmp;
        }
    }

    private double tienPhucVu(){
        if(soNgayLuuTru() == 0){
            return (double) (loaiPhong.getPhiPhucVu()*loaiPhong.getDonGia());
        } else {
            return (double) (loaiPhong.getPhiPhucVu()*loaiPhong.getDonGia()*soNgayLuuTru());
        }
    }


    private double tienPhaiTra(){
        double tmp = tienPhong();
        return (double) Math.round(tmp*100)/100;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + maPhong + " " + soNgayLuuTru() + " " + String.format("%.2f", tienPhaiTra());
    }

    @Override
    public int compareTo(KhachHang o) {
        if(soNgayLuuTru() < o.soNgayLuuTru()){
            return 1;
        } else if(soNgayLuuTru() > o.soNgayLuuTru()){
            return -1;
        }
        return 0;
    }
}
