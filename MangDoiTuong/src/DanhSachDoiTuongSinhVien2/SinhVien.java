package DanhSachDoiTuongSinhVien2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class SinhVien {
    private String studentCode;
    private String name;
    private Date dob;
    private String className;
    private float gpa;

    public SinhVien() {
        studentCode = "";
        name = "";
        dob = new Date();
        className = "";
        gpa = 0;
    }

    public SinhVien(int n, String name, String className, String dob, float gpa) throws ParseException {
        this.studentCode = "B20DCCN" + String.format("%03d", n);
        this.name = chuanHoa(name);
        this.className = className;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.gpa = gpa;
    }

    private String chuanHoa(String s) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String t = st.nextToken();
            sb.append(Character.toUpperCase(t.charAt(0)));
            for (int i = 1; i < t.length(); i++) {
                sb.append(Character.toLowerCase(t.charAt(i)));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public String toString() {
        return this.studentCode + " " + this.name + " " + this.className + " "
                + new SimpleDateFormat("dd/MM/yyyy").format(dob) + " "
                + String.format("%.2f", gpa);
    }
}