package BaiToanTinhCong;

import java.util.Scanner;

public class J04012 {
    public static void main(String[] args) {
        int id = 1;
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee(id++, sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), sc.nextLine());
        System.out.println(e);
    }
}
