package GiaoCuaHaiDaySo;

import java.util.*;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        Set<Integer> s1 = new TreeSet<>();
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            s1.add(a[i]);
        }
        Set<Integer> s2 = new TreeSet<>();
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
            s2.add(b[i]);
        }
        s1.retainAll(s2);
        for(Integer x:s1){
            System.out.print(x+" ");
        }

    }
}
