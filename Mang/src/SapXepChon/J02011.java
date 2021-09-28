package SapXepChon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 1;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int val = sc.nextInt();
            a.add(val);
        }
        for(int i = 0; i < n-1; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(a.get(min) > a.get(j)) min = j;
            }
            Collections.swap(a, i, min);
            System.out.print("Buoc " + count++ + ": ");
            for(int k = 0; k < n; k++){
                System.out.print(a.get(k) + " ");
            }
            System.out.println();
        }
    }
}
