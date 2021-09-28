package GiaiPhuongTrinhBacNhat;

import java.util.Scanner;

public class J01003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        if(a == 0 && b == 0){
            System.out.println("VSN");
        } else if(a == 0){
            System.out.println("VN");
        } else {
            if(b == 0) System.out.format("%.2f", b/a);
            else System.out.format("%.2f", -b/a);
            System.out.println();
        }
    }
}
