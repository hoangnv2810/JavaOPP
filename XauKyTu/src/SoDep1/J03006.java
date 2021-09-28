package SoDep1;

import java.util.Scanner;

public class J03006 {
    public static boolean soDep1(String s){
        StringBuilder str = new StringBuilder(s);
        if(str.reverse().toString().compareTo(s) != 0){
            return false;
        }
        for(int i = 0; i <= s.length()/2; i++){
            int temp = s.charAt(i)-'0';
            if(temp%2 != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(soDep1(s)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
