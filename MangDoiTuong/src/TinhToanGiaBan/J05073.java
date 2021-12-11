package TinhToanGiaBan;

import java.util.Scanner;

public class J05073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            DonHang dh = new DonHang(sc.next(), sc.nextInt(), sc.nextInt());
            System.out.println(dh);
        }
    }
}
