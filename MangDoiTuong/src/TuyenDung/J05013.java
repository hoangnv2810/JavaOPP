package TuyenDung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThiSinh> listTS = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            listTS.add(new ThiSinh(i, sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(listTS);
        for(ThiSinh ts:listTS){
            System.out.println(ts);
        }
    }
}
