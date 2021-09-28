package DanhSachDoiTuongNhanVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien {
    private String employeeCode;
    private String name;
    private String gender;
    private Date dob;
    private String address;
    private String taxCode;
    private Date signDate;

    public NhanVien(int n, String name, String gender, String dob, String address, String taxCode, String signDate) throws ParseException {
        this.employeeCode = String.format("%05d", n);
        this.name = name;
        this.gender = gender;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.address = address;
        this.taxCode = taxCode;
        this.signDate = new SimpleDateFormat("dd/MM/yyyy").parse(signDate);
    }

    @Override
    public String toString() {
        return employeeCode +
                " " + name +
                " " + gender +
                " " + new SimpleDateFormat("dd/MM/yyyy").format(dob) +
                " " + address +
                " " + taxCode +
                " " + new SimpleDateFormat("dd/MM/yyyy").format(signDate);
    }
}
