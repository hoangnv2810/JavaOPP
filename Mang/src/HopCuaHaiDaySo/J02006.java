package HopCuaHaiDaySo;

import java.util.*;

public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int vl = sc.nextInt();
            a.add(vl);
        }
        for(int i = 0; i < m; i++){
            int vl = sc.nextInt();
            b.add(vl);
        }
        Set<Integer> s = new TreeSet<>();
        s.addAll(a);
        s.addAll(b);
        for(Integer i:s){
            System.out.print(i+" ");
        }
    }
}
