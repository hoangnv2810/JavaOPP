package SoLienKe;

import java.util.Scanner;

public class J01017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while (t-- > 0){
            String s = sc.next();
            boolean check = true;
            for(int i = 1; i < s.length()-1; i++){
                int tmp = Integer.parseInt(String.valueOf(s.charAt(i)));
                int left = Integer.parseInt(String.valueOf(s.charAt(i-1)));
                int right = Integer.parseInt(String.valueOf(s.charAt(i+1)));
                if(Math.abs(tmp-left) != 1 || Math.abs(tmp-right) != 1){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
