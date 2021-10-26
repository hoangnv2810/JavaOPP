package BangLuongTheoPhongBan;

import java.util.ArrayList;
import java.util.Scanner;

public class J05078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<PhongBan> listPB = new ArrayList<>();
        ArrayList<NhanVien> listNV = new ArrayList<>();
        while (t-- > 0){
            String s = sc.nextLine();
            int index = s.indexOf(" ");
            PhongBan pb = new PhongBan(s.substring(0, index), s.substring(index+1));
            listPB.add(pb);
        }

        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0){
            NhanVien nv = new NhanVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            listNV.add(nv);

        }

        String idPB = sc.nextLine();
        String namePB = "";
        for(PhongBan pb: listPB){
            if(pb.getId().compareTo(idPB) == 0){
                namePB = pb.getName();
                break;
            }
        }
        System.out.println("Bang luong phong " + namePB + ":");
        for(NhanVien nv: listNV){
            if(nv.phongBan().compareTo(idPB) == 0){
                System.out.println(nv);
            }
        }

    }
}
