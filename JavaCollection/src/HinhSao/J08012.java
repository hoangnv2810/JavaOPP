package HinhSao;

import java.util.HashMap;
import java.util.Scanner;

public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            hm.put(b, a);
            hm.put(a, b);
        }
        if (hm.size() == n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}
