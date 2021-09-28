package CatDoi;

import java.math.BigInteger;
import java.util.Scanner;

public class J01010 {
    public static String check(char n){
        if(n == '0' || n == '8' || n == '9'){
            return "0";
        } else if(n == '1'){
            return "1";
        } else {
            return "INVALID";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String num = sc.nextLine();
            String res = "";
            for(int i = 0; i < num.length(); i++){
                String tmp = check(num.charAt(i));
                if(tmp != "INVALID"){
                    res += tmp;
                } else {
                    res = "INVALID";
                    break;
                }
            }

            int i = 0;
            while(i < res.length()){
                if(res.charAt(i) != '0'){
                    break;
                }
                i++;
            }
            if(i == num.length() || res == "INVALID"){
                System.out.println("INVALID");
            } else {
                res = res.substring(i);
                System.out.println(res);
            }
        }
    }
}
