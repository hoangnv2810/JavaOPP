package LuongMuaTrungBinh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tram {
    private String ma, ten;
    private long soPhut, soLuongMua;

    public Tram(int ma, String ten, String start, String end, long luongMua) throws ParseException {
        this.ma = "T" + String.format("%02d", ma);
        this.ten = ten;
        this.soPhut = tongSoPhut(new SimpleDateFormat("HH:mm").parse(start), new SimpleDateFormat("HH:mm").parse(end));
        this.soLuongMua = luongMua;
    }

    public long tongSoPhut(Date start, Date end){
        long diff = end.getTime()-start.getTime();
        return (diff/(60*60*1000)%60)*60 + diff/(60*1000)%60;
    }

    public String getTen() {
        return ten;
    }

    public long getSoPhut() {
        return soPhut;
    }

    public long getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoPhut(long soPhut) {
        this.soPhut = soPhut;
    }

    public void setSoLuongMua(long soLuongMua) {
        this.soLuongMua = soLuongMua;
    }

    private double tb(){
        double ans = (soLuongMua*1.0/soPhut)*60;
        return (double) Math.round(ans*100)/100;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + String.format("%.2f", tb());
    }
}
