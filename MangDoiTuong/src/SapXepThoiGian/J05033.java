package SapXepThoiGian;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05033 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Time> listTime = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            Time tmp = new Time(sc.nextLine());
            listTime.add(tmp);
        }
        Collections.sort(listTime);
        for(Time time:listTime){
            System.out.println(time);
        }
    }
}
