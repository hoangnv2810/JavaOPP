package SoChinhPhuong;

import java.util.Scanner;

public class J01026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            int num = sc.nextInt();
            int can = (int) Math.sqrt(num);
            if(can*can == num){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
