package DanhSachMonThi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07058 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonThi> listMT = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            listMT.add(new MonThi(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(listMT);
        for(MonThi mt:listMT){
            System.out.println(mt);
        }
    }
}
