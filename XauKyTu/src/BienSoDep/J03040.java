package BienSoDep;

import java.util.Scanner;

public class J03040 {
    private static boolean tang(String s){
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) != '.'){
                if(s.charAt(i) <= s.charAt(i-1)){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean bangnhau(String s){
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(i-1)){
                return false;
            }
        }
        return true;
    }

    private static boolean dk3(String s){
        return bangnhau(s.substring(0, s.indexOf('.'))) && bangnhau(s.substring(s.indexOf('.')+1));
    }

    private static boolean locphat(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '.'){
                if(s.charAt(i) != '6' && s.charAt(i) != '8'){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String s[] = sc.nextLine().split("[-]");
            if(tang(s[1]) || bangnhau(s[1]) || dk3(s[1]) || locphat(s[1])){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
