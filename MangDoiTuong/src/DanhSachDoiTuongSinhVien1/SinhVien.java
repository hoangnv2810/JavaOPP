package DanhSachDoiTuongSinhVien1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    private String studentCode;
    private String name;
    private Date birthday;
    private String className;
    private float gpa;

    public SinhVien() {
        this.studentCode = "";
        this.name = "";
        this.className = "";
        this.birthday = new Date();
        this.gpa = 0;
    }

    public SinhVien(int n, String name, String className, String birthday, float gpa) throws ParseException, ParseException {
        this.studentCode = "B20DCCN" + String.format("%03d", n);
        this.name = name;
        this.className = className;
        this.birthday = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return this.studentCode + " " + this.name + " " + this.className + " "
                + new SimpleDateFormat("dd/MM/yyyy").format(birthday) + " "
                + String.format("%.2f", this.gpa);
    }



}
