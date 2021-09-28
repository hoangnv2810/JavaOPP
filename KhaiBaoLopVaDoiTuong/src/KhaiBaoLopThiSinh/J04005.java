/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KhaiBaoLopThiSinh;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author hn281
 */
public class J04005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String birthday = sc.nextLine();
        float point[] = new float[3];
        for(int i = 0; i < 3; i++){
            point[i] = sc.nextFloat();
        }
        ThiSinh ts = new ThiSinh(name, birthday, point);
        System.out.println(ts);
    }
}
