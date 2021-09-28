package SapXepDoiChoTrucTiep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class J02010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        int count = 1;
        while(t-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            for(int i = 0; i < n; i++){
                int val = sc.nextInt();
                a.add(val);
            }
            for(int i = 0; i < n; i++){
                boolean flag = false;
                for(int j = i+1; j < n; j++){
                    if(a.get(i) > a.get(j)){
                        flag = true;
                        Collections.swap(a, i, j);
                    }
                }
                if(flag){
                    System.out.printf("Buoc " + count++ + ": ");
                    for(int k = 0; k < n; k++){
                        System.out.print(a.get(k) + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
