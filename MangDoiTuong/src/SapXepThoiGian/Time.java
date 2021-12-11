package SapXepThoiGian;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time implements Comparable<Time>{
    private int gio, phut, giay;

    public Time(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    @Override
    public int compareTo(Time o) {
        if(gio > o.gio){
            return 1;
        } else if(gio == o.gio){
            if(phut > o.phut){
                return 1;
            } else if(phut == o.phut){
                if(giay > o.giay){
                    return 1;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return gio + " " + phut + " " + giay;
    }
}
