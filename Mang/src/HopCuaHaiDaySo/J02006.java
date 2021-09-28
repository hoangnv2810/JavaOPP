package HopCuaHaiDaySo;

import java.util.*;

public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        ArrayList<Long> a = new ArrayList<>();
        ArrayList<Long> b = new ArrayList<>();
        for(int i = 0; i < n; i++){
            long vl = sc.nextLong();
            a.add(vl);
        }
        for(int i = 0; i < m; i++){
            long vl = sc.nextLong();
            b.add(vl);
        }
        Set<Long> s = new HashSet<>();
        s.addAll(a);
        s.addAll(b);
        String res = "";
        for(Long i:s){
            res += i + " ";
        }
        System.out.println(res.trim());
    }
}
