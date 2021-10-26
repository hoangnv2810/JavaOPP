package SoPhuc;

import java.util.Scanner;

public class J04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String s = sc.nextLine();
            String a[] = s.split("\\s+");
            SoPhuc num1 = new SoPhuc(Double.parseDouble(a[0]), Double.parseDouble(a[1]));
            SoPhuc num2 = new SoPhuc(Double.parseDouble(a[2]), Double.parseDouble(a[3]));
            System.out.print(num1.sum(num2).mul(num1) + ", ");
            System.out.println(num1.sum(num2).mul(num1.sum(num2)));
        }
    }
}
