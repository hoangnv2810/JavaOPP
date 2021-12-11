package KetQuaXetTuyen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
        return 2021 - dob.getYear() - 1900;
    }

    private double bonus(){
        if(pointTheory >= 8 && pointPractice >= 8){
            return 1;
        } else if(pointPractice >= 7.5 && pointTheory >= 7.5){
            return 0.5;
        } else {
            return 0;
        }
    }

    private int totalPoint(){
        double tmp = (double) (pointTheory+pointPractice)/2 + bonus();
        int ans = (int) Math.round(tmp);
        if(ans > 10){
            return 10;
        } else {
            return ans;
        }
    }

    private String rank(){
        if(totalPoint() >= 9){
            return "Xuat sac";
        } else if(totalPoint() >= 8){
            return "Gioi";
        } else if(totalPoint() >= 7){
            return "Kha";
        } else if(totalPoint() >= 5){
            return "Trung binh";
        } else{
            return "Truot";
        }
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age() + " " + totalPoint() + " " + rank();
    }
}
