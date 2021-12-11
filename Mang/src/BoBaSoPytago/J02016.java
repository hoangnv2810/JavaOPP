package BoBaSoPytago;

import java.util.Arrays;
import java.util.Scanner;

public class J02016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long a[] = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
                a[i] = (long)Math.pow(a[i], 2);
            }
            Arrays.sort(a);
            int check = 0;
            for(int i = n-1; i > 1; i--){
                int right = i-1;
                int left;
                for(left = 0; left < right;){
                    if(a[left] + a[right] > a[i]){
                        right--;
                    } else if(a[left] + a[right] < a[i]){
                        left++;
                    } else {
                        check = 1;
                        break;
                    }
                }
            }
            if(check == 1){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
