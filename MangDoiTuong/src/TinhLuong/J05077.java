package TinhLuong;

import java.util.ArrayList;
import java.util.Scanner;

public class J05077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<PhongBan> listPB = new ArrayList<>();
        while (t-- > 0){
            String s = sc.nextLine();
            int index = s.indexOf(" ");
            PhongBan pb = new PhongBan(s.substring(0, index), s.substring(index+1));
            listPB.add(pb);
        }

        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0){
            NhanVien nv = new NhanVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            String namePB = "";
            for(PhongBan pb: listPB){
                if(pb.getId().compareTo(nv.phongBan()) == 0){
                    namePB = pb.getName();
                    break;
                }
            }
            System.out.println(nv + namePB + " " + nv.income());
        }
    }
}
