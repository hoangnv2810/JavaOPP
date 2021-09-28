package TichMaTranVoiChuyenViCuaNo;

import java.util.Scanner;

public class J02103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int test = 1;
        while(t-- > 0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] a = new int[m][n];
            int[][] b = new int[m][m];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < m; i++){
                for(int j = 0; j < m; j++){
                    int id2 = 0, tmp = 0;
                    while(id2 < n){
                        tmp += a[i][id2]*a[j][id2];
                        id2++;
                    }
                    b[i][j] = tmp;
                }
            }
            System.out.println("Test " + test++ + ":");
            for(int i = 0; i < m; i++){
                for(int j = 0; j < m; j++){
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
