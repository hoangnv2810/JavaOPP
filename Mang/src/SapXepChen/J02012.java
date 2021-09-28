package SapXepChen;

import java.util.ArrayList;
import java.util.Scanner;

public class J02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Buoc " + count++ + ": " + a[0]);
        for(int i = 1; i < n; i++){
            int j = i-1;
            int temp = a[i];
            while(j >= 0 && a[j] > temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
            System.out.print("Buoc " + count++ + ": ");
            for(int k = 0; k <= i; k++){
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }
}
