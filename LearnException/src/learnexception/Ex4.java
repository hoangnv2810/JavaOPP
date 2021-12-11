/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Ex4 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new File("KQ.txt"));
        for(int i = 0; i < 1000; i++){
            out.println(i);
        }       
        out.close();
    }
}
