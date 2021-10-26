package QuanLyKhoXangDau;
import java.util.Scanner;

public class J05067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String s = sc.nextLine();
            DonHang dh = new DonHang(s.split("\\s+")[0], Integer.parseInt(s.split("\\s+")[1]));
            System.out.println(dh);
        }
    }
}
