package SapXepNoiBot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 1;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int val = sc.nextInt();
            a.add(val);
        }
        for(int i = 0; i < n; i++){
            boolean flag = false;
            for(int j = 0; j < n-1; j++){
                if(a.get(j) > a.get(j+1)){
                    Collections.swap(a, j, j+1);
                    flag = true;
                }
            }
            if(flag){
                System.out.print("Buoc " + count++ + ": ");
                for(int k = 0; k < n; k++){
                    System.out.print(a.get(k) + " ");
                }
                System.out.println();
            }
        }
    }
}
