package XepHangVanDongVien1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class VanDongVien implements Comparable<VanDongVien>{
    private String id;
    private String name;
    private Date dob;
    private Date timeStart;
    private Date timeEnd;

    public VanDongVien(int n, String name, String dob, String timeStart, String timeEnd) throws ParseException {
        this.id = "VDV" + String.format("%02d", n);
        this.name = name;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.timeStart = new SimpleDateFormat("HH:mm:ss").parse(timeStart);
        this.timeEnd = new SimpleDateFormat("HH:mm:ss").parse(timeEnd);
    }

    private int age(){
        Calendar c = Calendar.getInstance();
        c.setTime(dob);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DATE);
        LocalDate ld = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(ld, now);
        return diff.getYears();
    }

    private Date uuTien() throws ParseException {
        if(age() >= 32){
            return new SimpleDateFormat("HH:mm:ss").parse("00:00:03");
        } else if(age() >= 25){
            return new SimpleDateFormat("HH:mm:ss").parse("00:00:02");
        } else if(age() >= 18){
            return new SimpleDateFormat("HH:mm:ss").parse("00:00:01");
        } else {
            return new SimpleDateFormat("HH:mm:ss").parse("00:00:00");
        }
    }

    private Date timeConvert(long diff) throws ParseException {
        long seconds = diff/1000%60;
        long minutes = diff/(1000*60)%60;
        long hours = diff/(1000*60*60)%24;
        String ans = String.valueOf(hours) + ":" + String.valueOf(minutes) + ":" + String.valueOf(seconds);
        return new SimpleDateFormat("HH:mm:ss").parse(ans);
    }

    private Date thoiGian() throws ParseException {
        long diff = timeEnd.getTime()-timeStart.getTime();
        return timeConvert(diff);
    }

    public Date thoiGianXH() throws ParseException {
        long diff = thoiGian().getTime()-uuTien().getTime();
        return timeConvert(diff);
    }

    @Override
    public String toString() {
        try {
            return id + " " + name + " " +  new SimpleDateFormat("HH:mm:ss").format(thoiGian()) + " " + new SimpleDateFormat("HH:mm:ss").format(uuTien()) + " " + new SimpleDateFormat("HH:mm:ss").format(thoiGianXH());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public int compareTo(VanDongVien o) {
        try {
            if(thoiGianXH().before(o.thoiGianXH())){
                return -1;
            } else if(thoiGianXH().after(o.thoiGianXH())){
                return 1;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
