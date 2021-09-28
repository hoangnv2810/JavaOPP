package LietKeToHop2;

import java.util.Scanner;

public class J02021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[k];
        for(int i = 0; i < k; i++){
            a[i] = i+1;
        }
        int cnt = 0;
        while(true){
            for(int i = 0; i < k; i++){
                System.out.print(a[i]);
                cnt++;
            }
            System.out.print(" ");
            int i = k-1;
            while(i >= 0 && a[i] >= n-k+i+1) i--;
            if(i < 0) break;
            a[i]++;
            for(int j = i+1; j < k; j++){
                a[j] = a[i] + j-i;
            }
        }
        System.out.println("\nTong cong co " + cnt/k + " to hop");
    }
}
