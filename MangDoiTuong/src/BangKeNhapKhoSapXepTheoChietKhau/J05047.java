package BangKeNhapKhoSapXepTheoChietKhau;

import java.util.*;

public class J05047 {
    public static Map<String, Integer> mp = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<HangHoa> listHh = new ArrayList<>();
        while(t-- > 0){
            HangHoa hh = new HangHoa(sc.nextLine(), Integer.parseInt(sc.nextLine()), Long.parseLong(sc.nextLine()));
            listHh.add(hh);
        }
        Collections.sort(listHh);
        for(HangHoa hh:listHh){
            System.out.println(hh);
        }
    }
}
