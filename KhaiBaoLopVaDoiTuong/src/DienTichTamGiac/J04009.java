package DienTichTamGiac;
import java.util.Scanner;

public class J04009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());
            Triangle tg = new Triangle(p1, p2, p3);
            System.out.println(tg);
        }
    }
}
