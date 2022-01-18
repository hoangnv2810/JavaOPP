package DanhSachCaThi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CaThi implements Comparable<CaThi>{
    private String ma;
    private Date ngayThi, gioThi;
    private String phong;

    public CaThi(int ma, String ngayThi, String gioThi, String phong) throws ParseException {
        this.ma = "C" + String.format("%02d", ma);
        this.ngayThi = new SimpleDateFormat("dd/MM/yyyy").parse(ngayThi);
        this.gioThi = new SimpleDateFormat("HH:mm").parse(gioThi);
        this.phong = phong;
    }

    @Override
    public String toString() {
        return ma + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngayThi) + " " + new SimpleDateFormat("HH:mm").format(gioThi) + " " + phong;
    }

    @Override
    public int compareTo(CaThi o) {
        if(ngayThi.after(o.ngayThi)){
            return 1;
        } else if(ngayThi.before(o.ngayThi)){
            return -1;
        } else {
            if(gioThi.after(o.gioThi)){
                return 1;
            } else if(gioThi.before(o.gioThi)){
                return -1;
            } else {
                if(ma.compareTo(o.ma) > 0){
                    return 1;
                } else {
                    return -1;
                }
            }
        }
    }
}
