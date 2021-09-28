/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KhaiBaoLopSinhVien;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author hn281
 */
public class J04006 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SinhVien st = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
        System.out.println(st);
//        birthday.replaceAll("\\s+", "")
    }
}
