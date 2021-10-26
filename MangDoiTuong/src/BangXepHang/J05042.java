package BangXepHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<HocSinh> listHs = new ArrayList<>();
        while (t-- > 0){
            String name = sc.nextLine();
            String s[] = sc.nextLine().split("\\s+");
            HocSinh hs = new HocSinh(name, Integer.parseInt(s[0]), Integer.parseInt(s[1]));
            listHs.add(hs);
        }
        Collections.sort(listHs);
        for(HocSinh hs:listHs){
            System.out.println(hs);
        }
    }
}
