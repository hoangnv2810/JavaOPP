package DaoTu;

import java.util.Scanner;

public class J03032 {
    private static String solve(String s){
        StringBuilder res = new StringBuilder(s);
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String s[] = sc.nextLine().split("\\s+");
            for(int i = 0; i < s.length; i++){
                System.out.print(solve(s[i]) + " ");
            }
            System.out.println();
        }
    }
}
