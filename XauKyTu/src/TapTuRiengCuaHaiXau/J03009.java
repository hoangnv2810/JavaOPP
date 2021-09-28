package TapTuRiengCuaHaiXau;

import java.util.*;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String[] s1 = a.split(" ");
            String[] s2 = b.split(" ");
            Set<String> setS1 = new TreeSet<>();
            Set<String> setS2 = new TreeSet<>();
            ArrayList<String> arrList = new ArrayList<>();
            for(String x: s1){
                setS1.add(x);
            }
            for(String x: s2){
                setS2.add(x);
            }
            for(String s : setS1){
                if(!setS2.contains(s)){
                    System.out.print(s + " ");
                }
            }
            System.out.println();
        }
    }
}
