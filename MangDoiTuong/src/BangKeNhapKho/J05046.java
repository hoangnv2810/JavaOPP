package BangKeNhapKho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J05046 {
    public static Map<String, Integer> mp = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<HangHoa> listHh = new ArrayList<>();
        while(t-- > 0){
            HangHoa hh = new HangHoa(sc.nextLine(), Integer.parseInt(sc.nextLine()), Long.parseLong(sc.nextLine()));
            listHh.add(hh);
        }
        for(HangHoa hh:listHh){
            System.out.println(hh);
        }
    }
}
