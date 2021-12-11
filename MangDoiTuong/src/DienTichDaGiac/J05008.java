package DienTichDaGiac;

import java.util.Scanner;

public class J05008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Point p[] = new Point[n];
            for(int i = 0; i < n; i++){
                p[i] = new Point(sc.nextInt(),sc.nextInt());
            }
            DaGiac dg = new DaGiac(p);
            System.out.println(dg.getArea());
        }
    }
}
