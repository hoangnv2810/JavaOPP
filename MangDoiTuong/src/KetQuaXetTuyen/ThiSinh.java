package KetQuaXetTuyen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class ThiSinh {
    private String id;
    private String name;
    private Date dob;
    private float pointTheory;
    private float pointPractice;

    public ThiSinh(int n, String name, String dob, float pointTheory, float pointPractice) throws ParseException {
        this.id = "PH" + String.format("%02d", n);
        this.name = name;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.pointTheory = pointTheory;
        this.pointPractice = pointPractice;
    }

    private int age(){
        Calendar c = Calendar.getInstance();
        c.setTime(dob);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);
        LocalDate ld = LocalDate.of(year, month, date);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(ld, now);
        return diff.getYears();
    }

    private double bonus(){
        if(pointTheory >= 8 &&pointPractice >= 8){
            return 1;
        } else if(pointPractice >= 7.5 && pointTheory >= 7.5){
            return 0.5;
        } else {
            return 0;
        }
    }

    private int totalPoint(){
        double ans = Math.round((pointPractice+pointTheory)/2 + bonus());
        if(ans > 10){
            return 10;
        } else {
            return (int) ans;
        }
    }

    private String rank(){
        if(totalPoint() < 5){
            return "Truot";
        } else if(totalPoint() >= 5 && totalPoint() <= 6){
            return "Trung binh";
        } else if(totalPoint() == 7){
            return "Kha";
        } else if(totalPoint() == 8){
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age() + " " + totalPoint() + " " + rank();
    }
}
