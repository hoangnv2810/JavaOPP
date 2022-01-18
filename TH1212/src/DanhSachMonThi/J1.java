package DanhSachMonThi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> listMH = new ArrayList<>();
        while (t-- > 0){
            listMH.add(new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(listMH);
        for(MonHoc mh:listMH){
            System.out.println(mh);
        }
    }
}
