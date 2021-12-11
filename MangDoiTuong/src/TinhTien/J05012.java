package TinhTien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> listMH = new ArrayList<>();
        while (t-- > 0){
            listMH.add(new MatHang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(listMH);
        for(MatHang mh:listMH){
            System.out.println(mh);
        }
    }
}
