package QuanLyBanHang2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang {
    private String ma;
    private String name;
    private String gender;
    private Date dob;
    private String address;


    public KhachHang(int n, String name, String gender, String dob, String address) throws ParseException {
        this.ma = "KH" + String.format("%03d", n);
        this.name = name;
        this.gender = gender;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.address = address;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return name + " " + address;
    }
}

