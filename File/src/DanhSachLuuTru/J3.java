package DanhSachLuuTru;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Khach> listKhach = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            Khach k = new Khach(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            listKhach.add(k);
        }
        Collections.sort(listKhach);
        for(Khach k:listKhach){
            System.out.println(k);
        }
    }
}
