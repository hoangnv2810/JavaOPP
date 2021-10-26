package BangDiemTuyenSinh;

import java.util.Scanner;

public class J05057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            float point[] = new float[3];
            for(int i = 0; i < 3; i++){
                point[i] = Float.parseFloat(sc.nextLine());
            }
            HocSinh hs = new HocSinh(id, name, point);
            System.out.println(hs);
        }
    }
}
