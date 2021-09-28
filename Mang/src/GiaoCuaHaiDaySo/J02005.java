package GiaoCuaHaiDaySo;

import java.util.*;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            s.add(a[i]);
        }
        Object[] c = s.toArray();
        Set<Integer> g = new HashSet<>();
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
            g.add(b[i]);
        }

//        Object[] d = g.toArray();
//        int i = 0, j = 0;
//        while(i < n && j < m){
//            if(c[i] < d[j]){
//                i++;
//            } else if(c[i] > d[j]){
//                j++;
//            } else {
//                System.out.print();
//            }
//        }

    }
}
