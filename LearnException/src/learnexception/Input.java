/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnexception;

import java.util.Scanner;

/**
 *
 * @author hn281
 */
public class Input {
    public static double readGPA(Scanner sc) throws GPAException{
        double x = sc.nextDouble();
        if(x < 0 || x > 10) throw new GPAException();
        return x;
    }
}
