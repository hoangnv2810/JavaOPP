package LuaChonThamLam;

import java.util.Scanner;

public class J02023 {
    public static void numMin(int n, int s){
        if(s > n*9){
            System.out.printf("-1 ");
            return;
        }
        if(s == 0 && n == 1){
            System.out.printf("0 ");
            return;
        }
        if(s == 0 && n != 1){
            System.out.printf("-1 ");
            return;
        }
        int[] res = new int[n];
        s -= 1;
        int i = n-1;
        while(i > 0){
            if(s > 9){
                res[i] = 9;
                s -= 9;
            } else {
                res[i] = s;
                s = 0;
            }
            i--;
        }
        res[0] = s+1;
        for(int in:res){
            System.out.print(in);
        }
        System.out.print(" ");
    }

    public static void numMax(int n, int s){
        if(s == 0 && n == 1){
            System.out.println("0");
            return;
        }
        if(s == 0 && n != 1){
            System.out.println("-1");
            return;
        }
        if(s > 9*n){
            System.out.println("-1");
            return;
        }
        int[] res = new int[n];
        int i = 0;
        while(i < n){
            if(s >= 9){
                res[i] = 9;
                s -= 9;
            } else if(s < 9){
                res[i] = s;
                s = 0;
            }
            i++;
        }
        for(int in:res){
            System.out.print(in);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t-- > 0){
            int n = sc.nextInt();
            int s = sc.nextInt();
            numMin(n,s);
            numMax(n,s);
        }
    }
}
