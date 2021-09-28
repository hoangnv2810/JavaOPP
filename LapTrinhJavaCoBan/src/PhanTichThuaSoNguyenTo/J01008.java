package PhanTichThuaSoNguyenTo;

import java.util.Scanner;
public class J01008 {
    public static int isPrime(int n){
        if(n < 2) return 0;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 1;
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.print("Test " + count++ + ": ");
            for(int i = 2; i <= Math.sqrt(n); i++){
                int mu = 0;
                if(isPrime(i) == 1){
                    while(n%i == 0){
                        mu++;
                        n = n/i;
                    }
                    if(mu != 0){
                        System.out.printf(i + "(" + mu  + ")" + " ");
                    }
                }
            }
            if(n > 1) System.out.print(n + "(1)" +"\n");
            else System.out.println();
        }
    }
}
