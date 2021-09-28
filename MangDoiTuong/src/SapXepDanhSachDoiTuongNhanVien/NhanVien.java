package SapXepDanhSachDoiTuongNhanVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class NhanVien implements Comparable<NhanVien>{
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

    public int calAge(){
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(dob);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);
        LocalDate l = LocalDate.of(year, month, date);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(l, now);
        return diff.getYears();
    }

    @Override
    public int compareTo(NhanVien o) {
        if(this.calAge() < o.calAge()) return 1;
        if(this.calAge() > o.calAge()) return -1;
        return 0;
    }
}
