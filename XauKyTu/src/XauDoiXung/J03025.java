package XauDoiXung;

import java.util.Scanner;

public class J03025 {
    public static boolean XauDoiXung(String s){
//        int i = s.length()/2-1;
//        int j;
//        if(s.length()%2 == 0) j = i+1;
//        else j = i+2;
        int cntDif = 0;
//        while(i >= 0 && j <= s.length()-1){
//            if(s.charAt(i) != s.charAt(j)) cntDif++;
//            i--; j++;
//        }
//        return (cntDif == 1);
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                cntDif++;
            }
        }

        return cntDif == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();

            int cntDif = 0;
            for(int i = 0; i < s.length()/2; i++){
                if(s.charAt(i) != s.charAt(s.length()-i-1)){
                    cntDif++;
                }
            }
            if(cntDif <= 1){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
