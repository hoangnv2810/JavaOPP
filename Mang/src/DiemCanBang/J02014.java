package DiemCanBang;

import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int sum = 0;
            for(int i = 0; i < n; i++){
                sum += a[i];
            }
            int sumLeft = 0, res = -1;
            for(int i = 0; i < n; i++){
                sum -= a[i];
                if(sum == sumLeft){
                    res = i+1;
                    break;
                }
                sumLeft += a[i];
            }
            System.out.println(res);
        }
    }
}
