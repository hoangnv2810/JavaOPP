package LopHocPhan1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<HocPhan> listHP = new ArrayList<>();
        while (t-- > 0){
            listHP.add(new HocPhan(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(listHP);

        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String ma = sc.nextLine();
            int td = 1;
            for (HocPhan hp:listHP){
                if(hp.getMa().compareTo(ma) == 0){
                    if(td == 1){
                        System.out.println("Danh sach nhom lop mon " + hp.getTen() + ":");
                        td--;
                    }
                    System.out.println(hp);
                }
            }
        }
    }
}
