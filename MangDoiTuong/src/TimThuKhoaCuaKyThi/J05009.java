package TimThuKhoaCuaKyThi;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05009 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HocSinh> listHs = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String name = sc.nextLine();
            String dob = sc.nextLine();
            float point[] = new float[3];
            for(int j = 0; j < 3; j++){
                point[j] = Float.parseFloat(sc.nextLine());
            }
            HocSinh hs = new HocSinh(i, name, dob, point);
            listHs.add(hs);
        }

        Collections.sort(listHs);
        float pointMac = listHs.get(0).tongDiem();
        for(HocSinh hs:listHs){
            if(hs.tongDiem() == pointMac) System.out.println(hs);
        }
    }
}
