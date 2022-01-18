package DanhSachDoanhNghiep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> listDn = new ArrayList<>();
        while (t-- > 0){
            DoanhNghiep dn = new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            listDn.add(dn);
        }
        Collections.sort(listDn);
        for(DoanhNghiep dn:listDn){
            System.out.println(dn);
        }
    }
}
