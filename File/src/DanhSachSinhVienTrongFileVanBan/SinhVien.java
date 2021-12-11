package DanhSachSinhVienTrongFileVanBan;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien implements Serializable {
    private String id;
    private String name;
    private String className;
    private Date dob;
    private float gpa;

    public SinhVien(int n, String name, String className, String dob, float gpa) throws ParseException {
        this.id = "B20DCCN" + String.format("%03d", n);
        this.name = name;
        this.className = className;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + new SimpleDateFormat("dd/MM/yyyy").format(dob) + " " + String.format("%.2f", gpa);
    }
}
