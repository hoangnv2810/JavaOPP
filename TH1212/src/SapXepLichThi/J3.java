package SapXepLichThi;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("MONTHI.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MonThi> listMT = new ArrayList<>();
        while (t-- > 0){
            listMT.add(new MonThi(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("CATHI.in"));
        t = Integer.parseInt(sc.nextLine());
        ArrayList<CaThi> listCT = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            listCT.add(new CaThi(i, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        sc = new Scanner(new File("LICHTHI.in"));
        t = Integer.parseInt(sc.nextLine());
        ArrayList<LichThi> listLT = new ArrayList<>();
        while (t-- > 0){
            String tmp[] = sc.nextLine().split("\\s+");
            CaThi ct = new CaThi();
            MonThi mt = new MonThi();
            for(CaThi c:listCT){
                if(c.getMa().compareTo(tmp[0]) == 0){
                    ct = c;
                    break;
                }
            }
            for(MonThi m:listMT){
                if(m.getMa().compareTo(tmp[1]) == 0){
                    mt = m;
                    break;
                }
            }
            listLT.add(new LichThi(ct, mt, tmp[2], tmp[3]));
        }

        Collections.sort(listLT);
        for(LichThi lt:listLT){
            System.out.println(lt);
        }
    }
}
