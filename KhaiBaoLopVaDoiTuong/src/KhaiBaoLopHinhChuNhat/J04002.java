package KhaiBaoLopHinhChuNhat;

import java.util.Scanner;

public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in[] = sc.nextLine().split("\\s+");
        if(Double.parseDouble(in[0]) <= 0 || Double.parseDouble(in[1]) <= 0){
            System.out.println("INVALID");
        } else {
            Rectange r = new Rectange(Double.parseDouble(in[0]), Double.parseDouble(in[1]), in[2]);
            System.out.println(r);
        }
    }
}
