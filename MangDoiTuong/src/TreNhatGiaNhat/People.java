package TreNhatGiaNhat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class People implements Comparable<People>{
    private String name;
    private Date dob;

    public People(String name, String dob) throws ParseException {
        this.name = name;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
    }

//    private long age(){
//        Calendar c = Calendar.getInstance();
//        c.setTime(dob);
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH)+1;
//        int date = c.get(Calendar.DATE);
//        LocalDate ld = LocalDate.of(year, month, date);
//        LocalDate now = LocalDate.now();
////        Period diff = Period.between(ld, now);
////        return diff.getYears();
//        return ChronoUnit.DAYS.between(ld, now);
//    }

    @Override
    public int compareTo(People o) {
        if(dob.before(o.dob)){
            return 1;
        } else if(dob.after(o.dob)){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return name;
    }
}
