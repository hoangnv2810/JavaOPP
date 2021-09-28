package SoXaCach;

import java.util.Arrays;
import java.util.Scanner;

public class J02022 {
    public static int[] a = new int[11];
    public static int[] vs = new int[11];
    public static int n;

    public static void Print() {
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void Try(int i) {
        for (int j = 1; j <= n; j++) {
            if (vs[j] == 0) {
                a[i] = j;
                if (i >= 2 && Math.abs(a[i] - a[i - 1]) != 1 || i == 1) {
                    vs[j] = 1;
                    if (i == n) {
                        Print();
                    } else {
                        Try(i + 1);
                    }
                    vs[j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Arrays.fill(vs, 0);
            n = sc.nextInt();
            Try(1);
        }
    }
}
