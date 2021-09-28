package LietKeNhapXuatHangTheoNhom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05049 {
    public static void main(String[] args) {
        ArrayList<HangHoa> listHh = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            HangHoa hh = new HangHoa(sc.nextLine(), Integer.parseInt(sc.nextLine()));
            listHh.add(hh);
        }
        String key = sc.nextLine();
        Collections.sort(listHh);
        for(HangHoa hh:listHh){
            if(hh.ktDau().compareTo(key) == 0)
                System.out.println(hh);
        }
    }
}
