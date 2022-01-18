package DanhSachTrungTuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> listTS = new ArrayList<>();
        while(n-- > 0){
            String line[] = new String[5];
            doFile(sc, line, 5);
            listTS.add(new ThiSinh(line));
        }
        Collections.sort(listTS);
        int ct = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> res = new ArrayList<>();
        float dc = 0;
        for (ThiSinh ts:listTS){
            if(ct > 0){
                dc = ts.tongDiem();
                ct--;
            }
        }
        System.out.println(dc);
        for(ThiSinh ts:listTS){
            if(ts.tongDiem() >= dc){
                System.out.println(ts + " TRUNG TUYEN");
            } else {
                System.out.println(ts + " TRUOT");
            }
        }

    }

    private static void doFile(Scanner sc, String[] line, int soDong) {
        for(int i = 0; i < soDong; i++){
            line[i] = sc.nextLine();
        }
    }
}
