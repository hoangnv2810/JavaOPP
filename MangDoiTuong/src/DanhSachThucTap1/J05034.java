package DanhSachThucTap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05034 {
    public static void main(String[] args) {
        ArrayList<SinhVien> listSv = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            SinhVien sv = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            listSv.add(sv);
        }

        Collections.sort(listSv);
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String nameEnterprise = sc.nextLine();
            for (SinhVien sv : listSv) {
                if(sv.getEnterprise().compareTo(nameEnterprise) == 0)
                    System.out.println(sv);
            }
        }
    }
}
