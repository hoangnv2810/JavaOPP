package TichHaiDoiTuongMaTran;

import java.util.Scanner;

public class Matrix {
    private int hang;
    private int cot;
    private int[][] a;

    public Matrix(int hang, int cot) {
        this.hang = hang;
        this.cot = cot;
        this.a = new int[hang][cot];
    }

    public void nextMatrix(Scanner sc){
        for(int i = 0; i < hang; i++){
            for(int j = 0; j < cot; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix mul(Matrix b){
        Matrix res = new Matrix(hang, b.cot);
        for(int i = 0; i < hang; i++){
            for(int j = 0; j < b.cot; j++){
                int tmp = 0;
                for(int l = 0; l < cot; l++){
                    tmp += a[i][l] * b.a[l][j];
                }
                res.a[i][j] = tmp;
            }
        }
        return res;
    }

    private String print(){
        String res = "";
        for(int i = 0; i < hang; i++){
            for(int j = 0; j < cot; j++){
                res += a[i][j] + " ";
            }
            res.trim();
            if(i != hang-1)
                res += "\n";
        }
        return res.trim();
    }

    @Override
    public String toString() {
        return print();
    }
}
