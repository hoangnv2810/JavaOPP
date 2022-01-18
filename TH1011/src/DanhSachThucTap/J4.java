package DanhSachThucTap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> listSV = new ArrayList<>();
        while (t-- > 0){
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            listSV.add(sv);
        }

        sc = new Scanner(new File("DN.in"));
        t = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> listDN = new ArrayList<>();
        while (t-- > 0){
            DoanhNghiep dn = new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            listDN.add(dn);
        }

        sc = new Scanner(new File("THUCTAP.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThucTap> listTT = new ArrayList<>();
        while (n-- > 0){
            String s[] = sc.nextLine().split("\\s+");
            SinhVien sv = new SinhVien();
            DoanhNghiep dn = new DoanhNghiep();
            for(SinhVien sinhv: listSV){
                if(sinhv.getId().compareTo(s[0]) == 0){
                    sv = sinhv;
                    break;
                }
            }
            for(DoanhNghiep doanhn: listDN){
                if(doanhn.getId().compareTo(s[1]) == 0){
                    dn = doanhn;
                    break;
                }
            }
            ThucTap tt = new ThucTap(sv, dn);
            listTT.add(tt);
        }

        Collections.sort(listTT);
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0){
            String idDN = sc.nextLine();
            System.out.print("DANH SACH THUC TAP TAI ");
            for (DoanhNghiep d:listDN){
                if(d.getId().compareTo(idDN) == 0){
                    System.out.println(d.getName()+":");
                }
            }
            for (ThucTap tt:listTT){
                if(tt.getDn().getId().compareTo(idDN) == 0 && tt.getDn().getNumber() > 0){
                    System.out.println(tt);
                    tt.getDn().setNumber(tt.getDn().getNumber()-1);
                }
            }
        }
    }
}
