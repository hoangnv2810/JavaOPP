package SapXepDoiChoTrucTiepLietKeNguoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for(int i = 0; i < n; i++){
                int tmp = sc.nextInt();
                a.add(tmp);
            }
            int cnt = 1;
            ArrayList<String> res = new ArrayList<>();
            for(int i = 0; i < n; i++){
                boolean flag = false;
                for(int j = i+1; j < n; j++){
                    if(a.get(i) > a.get(j)){
                        Collections.swap(a, i, j);
                        flag = true;
                    }
                }
                if(flag){
                    String temp = "Buoc " + String.valueOf(cnt++) + ": ";
                    for(int x:a){
                        temp += x + " ";
                    }
                    res.add(temp);
                }
            }
            Collections.reverse(res);
            for(String x:res){
                System.out.println(x);
            }
        }
    }
}
