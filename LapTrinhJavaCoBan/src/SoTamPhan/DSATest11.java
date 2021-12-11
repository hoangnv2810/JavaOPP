package SoTamPhan;

import java.util.Scanner;

public class DSATest11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String s = sc.next();
            int cnt = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2'){
                    cnt++;
                }
            }
            if(cnt == s.length()){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
