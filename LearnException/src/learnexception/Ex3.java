/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author hn281
 */
public class Ex3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
//        System.out.println(file.getAbsolutePath());
        Scanner sc = new Scanner(file);
        System.out.println(sc.nextLine());
    }
            
            
            
}
