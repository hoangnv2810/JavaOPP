package SoTamPhan;

import java.util.Scanner;

public class SoTamPhan {
    public static boolean check(String num){
        for(int i = 0; i < num.length(); i++){
            char tmp = num.charAt(i);
            if(tmp != '0' && tmp != '1' && tmp != '2'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String num = sc.nextLine();
            if(check(num)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
