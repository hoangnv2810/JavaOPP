package SoDep3;

import java.util.Scanner;

public class J03008 {
    public static boolean checkDigitPrime(int n){
        if(n == 2 || n == 3 || n == 5 || n == 7 || n == 9){
            return true;
        }
        return false;
    }
    public static boolean soDep3(String s){
        StringBuilder ans = new StringBuilder(s);
        if(ans.reverse().toString().compareTo(s) != 0){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            if(!checkDigitPrime(s.charAt(i)-'0')){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(soDep3(s)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
