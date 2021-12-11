package XetTuyen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class ThiSinh {
    private String ma;
    private String ten;
    private Date ngaySinh;
    private float diemLT;
    private float diemTH;

    public ThiSinh(int n, String line[]) throws ParseException {
        this.ma = "PH" + String.format("%02d", n);
        this.ten = chuanHoa(line[0]);
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(line[1]);
        this.diemLT = Float.parseFloat(line[2]);
        this.diemTH = Float.parseFloat(line[3]);
    }

    private String chuanHoa(String s) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()){
            String tmp = st.nextToken();
            sb.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1; i < tmp.length(); i++){
                sb.append(Character.toLowerCase(tmp.charAt(i)));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    private double diemThuong(){
        if(diemLT >= 8 && diemTH >= 8){
            return 1;
        } else if(diemLT >= 7.5 && diemTH >= 7.5){
            return 0.5;
        } else {
            return 0;
        }
    }

    private int diemTB(){
        double tmp = (double) (diemLT+diemTH)/2 + diemThuong();
        if((int) Math.round(tmp) > 10){
            return 10;
        }
        return (int) Math.round(tmp);
    }

    private String xepLoai(){
        if(diemTB() >= 9){
            return "Xuat sac";
        } else if(diemTB() >= 8){
            return "Gioi";
        } else if(diemTB() >= 7){
            return "Kha";
        } else if(diemTB() >= 5){
            return "Trung binh";
        } else{
            return "Truot";
        }
    }

    private int tuoi(){
        return 2021 - ngaySinh.getYear() - 1900;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tuoi() + " " + diemTB() + " " + xepLoai();
    }
}
