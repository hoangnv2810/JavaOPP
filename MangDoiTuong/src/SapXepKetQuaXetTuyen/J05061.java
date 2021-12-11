package SapXepKetQuaXetTuyen;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05061 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> listTS = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            ThiSinh ts = new ThiSinh(i, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            listTS.add(ts);
        }
        Collections.sort(listTS);
        for(ThiSinh ts:listTS){
            System.out.println(ts);
        }
    }
}
