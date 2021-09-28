package DanhSachCanh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J02104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        byte[][] a = new byte[n][n];
        List<String> res = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextByte();
                if(j > i && a[i][j] == 1){
                    String tmp = "(" + (i+1) + "," + (j+1) + ")";
                    res.add(tmp);
                }
            }
        }
        for(String x: res){
            System.out.println(x);
        }
    }
}
