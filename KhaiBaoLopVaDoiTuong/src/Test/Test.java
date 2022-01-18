package Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static Date StringToDate(String dob) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/dd/MM");
        Date date = sdf.parse(dob);
        return date;
    }
    public static void main(String[] args) throws ParseException{
//        String dob = "2001/01/12";
//        Date date = StringToDate(dob);
//        System.out.println("Date in the format: MM/dd/yyyy");
//        System.out.println(new SimpleDateFormat("MM/dd/yyyy").format(date));
//        System.out.println("Date in the format: dd/MM/yyyy");
//        System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(date));
//        System.out.println("Date in the format: yyyy/MM/dd");
//        System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(date));
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println(a + " " + b + " " + c);
//        String color = "rEA";
//        String ans = color.substring(0, 1).toUpperCase() + color.substring(1, color.length()).toLowerCase();
//        System.out.println(ans);

//        String result = String.format("%.2f", 1205.6358);
//        System.out.println(result);
//
//        String s = Double.toString(20.0);
//        int dot = s.indexOf('.');
//        if(s.charAt(dot+1) == '0'){
//            System.out.println(s.substring(0, dot));
//        } else {
//            System.out.println(s);
//        }


        double a = 10.1235;
        System.out.println((double) Math.round(a*1000)/1000);
    }
}
