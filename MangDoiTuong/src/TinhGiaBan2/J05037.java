package TinhGiaBan2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> listMh = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            MatHang mh = new MatHang(i, sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            listMh.add(mh);
        }
        Collections.sort(listMh);
        for(MatHang mh: listMh){
            System.out.println(mh);
        }
    }
}
