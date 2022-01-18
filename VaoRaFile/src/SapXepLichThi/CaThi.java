package SapXepLichThi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CaThi{
    private String ma;
    private Date ngayThi, gioThi;
    private String phong;

    public CaThi() {
    }

    public CaThi(int ma, String ngayThi, String gioThi, String phong) throws ParseException {
        this.ma = "C" + String.format("%03d", ma);
        this.ngayThi = new SimpleDateFormat("dd/MM/yyyy").parse(ngayThi);
        this.gioThi = new SimpleDateFormat("HH:mm").parse(gioThi);
        this.phong = phong;
    }

    public String getMa() {
        return ma;
    }

    public Date getNgayThi() {
        return ngayThi;
    }

    public Date getGioThi() {
        return gioThi;
    }

    @Override
    public String toString() {
        return new SimpleDateFormat("dd/MM/yyyy").format(ngayThi) + " " + new SimpleDateFormat("HH:mm").format(gioThi) + " " + phong;
    }

}
