package HoaDon2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang {
    private String id;
    private String name;
    private String gender;
    private Date dob;
    private String address;

    public KhachHang() {
    }

    public KhachHang(int n, String name, String gender, String dob, String address) throws ParseException {
        this.id = "KH" + String.format("%03d", n);
        this.name = name;
        this.gender = gender;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.address = address;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return name + " " + address;
    }
}
