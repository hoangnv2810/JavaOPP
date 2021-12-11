/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnexception;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hn281
 */
public class LearnException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        double gpa = 0;
        while(!check){
            try {
                gpa = Input.readGPA(sc);
                check = true;
            } catch (GPAException ex) {
                System.out.println("Nhap diem sai dinh dang");
            }
        }
        System.out.println(gpa);
    }
    
}
