package TinhNgayHetHanBaoHanh;


import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J6 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        ArrayList<SanPham> listSP = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            listSP.add(new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> listKH = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            String name = sc.nextLine();
            String diachi = sc.nextLine();
            String masp = sc.nextLine();
            int soLuong = Integer.parseInt(sc.nextLine());
            String ngayMua = sc.nextLine();
            for(SanPham sp:listSP){
                if(sp.getMa().compareTo(masp) == 0){
                    listKH.add(new KhachHang(i, name, diachi, sp, soLuong, ngayMua));
                    break;
                }
            }
        }
        Collections.sort(listKH);
        for (KhachHang kh:listKH){
            System.out.println(kh);
        }
    }
}
