package CapSoCoTongBangK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J08015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            long n = sc.nextLong();
            long sum = sc.nextLong();
            HashMap<Long, Long> hm = new HashMap<>();
            ArrayList<Long> a = new ArrayList<>();
            for(int i = 0; i < n; i++){
                long tmp = sc.nextInt();
                a.add(tmp);
                if(hm.containsKey(tmp)){
                    hm.put(tmp, hm.get(tmp) + 1);
                } else {
                    hm.put(tmp, 1L);
                }
            }
            long res = 0;
            for (Long i:a){
                if(hm.get(sum - i) != null){
                    res += hm.get(sum-i);
                }
                if(sum-i == i){
                    res -= 1;
                }
            }
            System.out.println(res/2);
        }
    }
}
