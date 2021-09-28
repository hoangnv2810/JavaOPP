package BangDiemHocSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05018 {
    public static void main(String[] args) {
        ArrayList<HocSinh> listHs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            HocSinh hs = new HocSinh(i, sc.nextLine(), sc.nextLine());
            listHs.add(hs);
        }
        Collections.sort(listHs);
        for(HocSinh hs:listHs){
            System.out.println(hs);
        }
    }
}
