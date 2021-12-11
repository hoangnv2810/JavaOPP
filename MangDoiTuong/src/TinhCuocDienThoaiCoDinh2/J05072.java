package TinhCuocDienThoaiCoDinh2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05072 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Tinh> listTinh = new ArrayList<>();
        while (t-- > 0){
            Tinh tinh = new Tinh(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            listTinh.add(tinh);
        }
        t = Integer.parseInt(sc.nextLine());
        ArrayList<CuocGoi> listCG = new ArrayList<>();
        while (t-- > 0){
            String s[] = sc.nextLine().split("\\s+");
            for(Tinh tinh:listTinh){
                if(s[0].startsWith("0")){
                    if(s[0].substring(1,3).compareTo(tinh.getMaVung()) == 0){
                        CuocGoi cg = new CuocGoi(s[0], s[1], s[2], tinh);
                        listCG.add(cg);
                        break;
                    }
                } else {
                    CuocGoi cg = new CuocGoi(s[0], s[1], s[2]);
                    listCG.add(cg);
                    break;
                }
            }
        }
        Collections.sort(listCG);
        for(CuocGoi cg:listCG){
            System.out.println(cg);
        }
    }
}
