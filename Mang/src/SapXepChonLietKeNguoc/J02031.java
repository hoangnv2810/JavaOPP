package SapXepChonLietKeNguoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            a.add(tmp);
        }
        int cnt = 1;
        ArrayList<String> res = new ArrayList<>();
        for(int i = 0; i < n-1; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(a.get(min) > a.get(j)) min = j;
            }
            Collections.swap(a, i, min);
            String tmp = "Buoc " + String.valueOf(cnt++) + ": ";
            for(int x: a){
                tmp += String.valueOf(x) + " ";
            }
            res.add(tmp);
        }
        Collections.reverse(res);
        for(String x:res){
            System.out.println(x);
        }
    }
}
