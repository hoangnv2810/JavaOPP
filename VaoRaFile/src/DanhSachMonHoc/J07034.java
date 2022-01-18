package DanhSachMonHoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07034 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> listMH = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            listMH.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(listMH);
        for(MonHoc mh:listMH){
            System.out.println(mh);
        }
    }
}
