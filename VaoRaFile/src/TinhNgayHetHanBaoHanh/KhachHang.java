package TinhNgayHetHanBaoHanh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class KhachHang implements Comparable<KhachHang> {
    private String maKH;
    private String ten;
    private String diaChi;
    private SanPham sanPham;
    private int soLuong;
    private Date ngayMua;

    public KhachHang(int n, String ten, String diaChi, SanPham sanPham, int soLuong, String ngayMua) throws ParseException {
        this.maKH = "KH" + String.format("%02d", n);
        this.ten = ten;
        this.diaChi = diaChi;
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.ngayMua = new SimpleDateFormat("dd/MM/yyyy").parse(ngayMua);
    }

    private Date ngayHetHan(){
        Calendar c = Calendar.getInstance();
        c.setTime(ngayMua);
        c.add(Calendar.MONTH, sanPham.getThoiLuongBH());
        return c.getTime();
    }

    @Override
    public String toString() {
        return maKH + " " + ten + " " + diaChi + " " + sanPham.getMa() +  " " + sanPham.getGiaBan()*soLuong + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngayHetHan());
    }

    @Override
    public int compareTo(KhachHang o) {
        if(ngayHetHan().after(o.ngayHetHan())){
            return 1;
        } else if(ngayHetHan().before(o.ngayHetHan())){
            return -1;
        } else {
            if(maKH.compareTo(o.maKH) > 0){
                return 1;
            } else {
                return -1;
            }
        }
    }
}
