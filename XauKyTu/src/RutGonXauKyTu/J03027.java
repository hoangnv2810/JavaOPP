package RutGonXauKyTu;

import java.util.Scanner;

public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t-- > 0){
            String s = sc.next();
            for(int i = 1; i < s.length(); i++){
                if(s.charAt(i-1) == s.charAt(i)){
                    String temp = s.substring(i-1, i+1);
                    s = s.replace(temp, "");
                    if(i < 2) i = 0;
                    else i -= 2;
                }
            }
            if(s.length() != 0) System.out.println(s);
            else System.out.println("Empty String");
        }
    }
}
