package DanhSachCaThi;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J2 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CaThi> listCT = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            listCT.add(new CaThi(i, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(listCT);
        for(CaThi ct:listCT){
            System.out.println(ct);
        }
    }
}
