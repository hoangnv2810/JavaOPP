package SoDep2;

import java.util.Scanner;

public class J03007 {
    public static boolean soDep2(String s){
        StringBuilder str = new StringBuilder(s);
        if(str.reverse().toString().compareTo(s) != 0){
            return false;
        }
        if(s.charAt(0) != '8') return false;
        long temp = 0;
        for(int i = 0; i < s.length()/2; i++){
            temp += s.charAt(i)-'0';
        }
        if((temp*2)%10 == 0 && s.length()%2 == 0) return true;
        if(s.length()%2 != 0 && (temp*2+(s.charAt(s.length()/2)-'0'))%10 == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(soDep2(s)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
