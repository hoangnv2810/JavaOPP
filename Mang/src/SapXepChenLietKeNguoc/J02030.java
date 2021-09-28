package SapXepChenLietKeNguoc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class J02030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int cnt = 0;
        ArrayList<String> res = new ArrayList<>();
        String tmp = "Buoc " + String.valueOf(cnt++) + ": ";
        tmp += String.valueOf(a[0]);
        res.add(tmp);
        for(int i = 1; i < n; i++){
            int j = i-1;
            int temp = a[i];
            while(j >= 0 && a[j] > temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
            tmp = "Buoc " + String.valueOf(cnt++) + ": ";
            for(int k = 0; k <= i; k++){
                tmp += String.valueOf(a[k]) + " ";
            }
            res.add(tmp);
        }
        Collections.reverse(res);
        for(String x:res){
            System.out.println(x);
        }
    }
}
