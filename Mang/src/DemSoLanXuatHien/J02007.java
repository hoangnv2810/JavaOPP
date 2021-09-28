package DemSoLanXuatHien;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Solution{

}
public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 1;
        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            Map<Integer, Integer> mp = new HashMap<>();
            for(int i : a){
                if(mp.containsKey(i)){
                    mp.put(i, mp.get(i) + 1);
                } else {
                    mp.put(i, 1);
                }
            }
            System.out.println("Test " + count++ + ":");
            for(int i = 0; i < n; i++){
                if(mp.get(a[i]) != -1){
                    System.out.println(a[i] + " xuat hien " + mp.get(a[i]) + " lan");
                    mp.put(a[i], -1);
                }
            }
        }
    }
}
