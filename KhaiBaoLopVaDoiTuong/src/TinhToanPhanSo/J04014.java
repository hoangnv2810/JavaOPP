package TinhToanPhanSo;

import java.util.Scanner;

public class J04014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            PhanSo p1 = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo p2 = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo sum = p1.sumPs(p2);
            PhanSo C = sum.mulPs(sum);
            PhanSo mul = p1.mulPs(p2);
            PhanSo D = mul.mulPs(C);
            System.out.println(C + " " + D);
        }
    }
}
