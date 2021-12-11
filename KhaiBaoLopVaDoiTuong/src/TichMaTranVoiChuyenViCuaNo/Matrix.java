package TichMaTranVoiChuyenViCuaNo;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    private int hang;
    private int cot;
    private int[][] a;

    public Matrix(int n, int m) {
        this.hang = n;
        this.cot = m;
        this.a = new int[hang][cot];
    }

    public void nextMatrix(Scanner sc) {
        for(int i = 0; i < hang; i++){
            for(int j = 0; j < cot; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix trans() {
        Matrix tmp = new Matrix(cot, hang);
        for(int i = 0; i < hang; i++){
            for(int j = 0; j < cot; j++){
                tmp.a[j][i] = a[i][j];
            }
        }
        return tmp;
    }

    public Matrix mul(Matrix b) {
        Matrix res = new Matrix(hang, b.cot);
        for(int i = 0; i < hang; i++){
            for(int j = 0; j < hang; j++){
                int tmp = 0;
                for(int l = 0; l < cot; l++){
                    tmp += a[i][l]*b.a[l][j];
                }
                res.a[i][j] = tmp;
            }
        }
        return res;
    }

    @Override
    public String toString() {
        String ans = "";
        for(int i = 0; i < hang; i++){
            for(int j = 0; j < cot; j++){
                ans += a[i][j] + " ";
            }
            ans.trim();
            if(i != hang-1) ans += '\n';
        }
        return ans;
    }
}
