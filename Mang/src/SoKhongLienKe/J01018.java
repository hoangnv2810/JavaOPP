package SoKhongLienKe;

import java.util.Scanner;

public class J01018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while (t-- > 0){
            String s = sc.next();
            boolean check = true;
            int sum = Integer.parseInt(String.valueOf(s.charAt(0))) + Integer.parseInt(String.valueOf(s.charAt(s.length()-1)));
            for(int i = 1; i < s.length()-1; i++){
                int tmp = Integer.parseInt(String.valueOf(s.charAt(i)));
                sum += tmp;
                int left = Integer.parseInt(String.valueOf(s.charAt(i-1)));
                int right = Integer.parseInt(String.valueOf(s.charAt(i+1)));
                if(Math.abs(tmp-left) != 2 || Math.abs(tmp-right) != 2){
                    check = false;
                    break;
                }
            }

            if(!check){
                System.out.println("NO");
            } else {
                if(sum%10 == 0){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
