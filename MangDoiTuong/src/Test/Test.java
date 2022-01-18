package Test;

import java.sql.SQLOutput;
import java.text.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Test {
    public static void main(String[] args) throws ParseException {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        String input = "28/10/2001";
//        Date d = sdf.parse(input);
//        Calendar c = Calendar.getInstance();
//        c.setTime(d);
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MARCH)+1;
//        int date = c.get(Calendar.DATE);
//        LocalDate l = LocalDate.of(year, month, date);
//        LocalDate now = LocalDate.now();
//        System.out.println(year);
//        System.out.println(now.getYear());
//        Period diff = Period.between(l, now);
//        System.out.println(diff.getYears());
//        System.out.println(diff.isNegative());

//        String in = "09:00";
//        String out = "10:30";
//        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
//        Date d1 = sdf.parse(in);
//        Date d2 = sdf.parse(out);
//        long diff = d2.getTime()-d1.getTime();
//        long diffSeconds = diff/1000%60;
//        long diffMinutes = diff/(60*1000)%60;
//        long diffHours = diff/(60*60*1000)%24;
//        long diffDays = diff/(24*60*60*1000);
//        System.out.println(diffHours + ":" + diffMinutes);

//        Format f = new SimpleDateFormat("HH mm ss");
//        System.out.println(f.format(new Date()));


//        String name = "Nguyen Van A";
//        System.out.println(name.contains(" "));

//        Date d = new SimpleDateFormat("dd/MM/yyyy").parse("28/10/2001");
//        Calendar c = Calendar.getInstance();
//        c.setTime(d);
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH)+1;
//        int date = c.get(Calendar.DATE);
//        LocalDate ld = LocalDate.of(year, month, date);
//        LocalDate now = LocalDate.now();
//        Period diff = Period.between(ld, now);
//        System.out.println(diff.getYears() + " " + diff.getMonths() + " " + diff.getDays());
//
//        String s = "KHf ke toan";
//        System.out.println(s.indexOf(" "));


//        double d = 8/3.0;
////        System.out.println(Math.round(d));

//        DecimalFormat df = new DecimalFormat("###,###,###");
//        System.out.println(df.format(Integer.parseInt("10000000")) + " VNĐ");
//        Locale localeVN = new Locale("vi", "VN");
//        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
//        System.out.println(currencyVN.format(Integer.parseInt("100000000")));
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = new Date();
//        String d = "2001-11-21";
//        Date date1 = sdf.parse(d);
////        System.out.println(date1);
//        float diem = 12F;
//        System.out.println(String.valueOf(diem));

//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        Date date = sdf.parse("08/03/2010");
//        Date date1 = sdf.parse("01/05/2010");
//        long diff = date1.getTime()-date.getTime();
//        int ngay = (int) (diff/(1000*60*60*24));
//        System.out.println(ngay);
//        System.out.println(Math.round(5.5));
        Date d2 = new SimpleDateFormat("dd/MM/yyyy").parse("22/12/2021");
        Date d1 = new SimpleDateFormat("dd/MM/yyyy").parse("05/11/2019");
        long diff = d2.getTime()-d1.getTime();
        System.out.println(diff/(1000*60*60*24));
//        System.out.println(date.getHours()*60 + date.getMinutes());
//        System.out.println(Math.round(120/(150/60)));
//        System.out.println(sdf.format(date));
//        System.out.println(date1.before(date));

//        Date date = new Date();
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
//        System.out.println("DAY "+simpleDateFormat.format(date).toUpperCase());
//
//        simpleDateFormat = new SimpleDateFormat("MMMM");
//        System.out.println("MONTH "+simpleDateFormat.format(date).toUpperCase());
//
//        simpleDateFormat = new SimpleDateFormat("YYYY");
//        System.out.println("YEAR "+simpleDateFormat.format(date).toUpperCase());
    }
}
