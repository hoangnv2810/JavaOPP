package SapXepNoiBotLietKeNguoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02032 {
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
            for(int i = 0; i < n-1; i++){
                boolean check = false;
                for(int j = 0; j < n-i-1; j++){
                    if(a.get(j) > a.get(j+1)){
                        Collections.swap(a, j, j+1);
                        check = true;
                    }
                }
                if(check){
                    String temp = "Buoc " + String.valueOf(cnt++) + ": ";
                    for(int x:a){
                        temp += String.valueOf(x) + " ";
                    }
                    res.add(temp);
                } else {
                    break;
                }
            }
            Collections.reverse(res);
            for(String x:res){
                System.out.println(x);
            }
        }
    }
}
